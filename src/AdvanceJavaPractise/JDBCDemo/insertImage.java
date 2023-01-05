package AdvanceJavaPractise.JDBCDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertImage {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = Conn.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into movies values(?,?)");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the path of movie");
            String path = scanner.nextLine();

            //Creating file
            File file = new File(path);

            //inserting file name
            String fileNameWithExtension  = file.getName();
            String fileName = fileNameWithExtension.substring(0,fileNameWithExtension.indexOf("."));
            ps.setString(1,fileName);

            //inserting file
            FileInputStream fileInputStream = new FileInputStream(file);
            ps.setBinaryStream(2,fileInputStream,(int)file.length());

            int res = ps.executeUpdate();
            if(res == 1)
                System.out.println("File Added Sucessfully");
            else
                System.out.println("File Not added");
            fileInputStream.close();


        }catch (SQLException sqlException){
            System.out.println("Error in connecting to Database");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error in closing file");
        }

        finally {
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Unable to close file");
                }
            }
        }
    }
}
