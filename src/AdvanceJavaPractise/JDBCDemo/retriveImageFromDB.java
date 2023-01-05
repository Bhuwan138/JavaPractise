package AdvanceJavaPractise.JDBCDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

class FolderNotCreatedException extends Exception{
    public FolderNotCreatedException(String message){
        super(message);
    }
}
public class retriveImageFromDB {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = Conn.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs =  st.executeQuery("SELECT * FROM movies");
            File file = new File("E:/MoviesCollection");
            //checking and creating folders
            if(!file.exists()){
                boolean isFilderCreated = file.mkdir();
                if(!isFilderCreated){
                    throw new FolderNotCreatedException("Unable to create folder");
                }else {
                    System.out.println("Folder Created");
                }
            }else {
                System.out.println("File Already Present");
            }

            //geting pictures
            while (rs.next()){
                String fileName = rs.getString(1);
                Blob imageFile = rs.getBlob(2);
                byte[] imageArray = imageFile.getBytes(1,(int) imageFile.length());
                FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsoluteFile() + "/"+ fileName + ".jpg");
                fileOutputStream.write(imageArray);
                fileOutputStream.close();
            }

        } catch (SQLException sqlException){
            System.err.println("Unable to connect to database");
        } catch (FolderNotCreatedException folderNotCreatedException){
            System.err.println("Exception :" + folderNotCreatedException.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("File not found " +  e.getMessage());
        } catch (IOException e) {
            System.out.println("Unable to create file");
        } finally{
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException sqlException){
                    System.out.println("Unable to close file");
                }
            }
        }
    }
}
