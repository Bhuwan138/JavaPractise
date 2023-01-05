package AdvanceJavaPractise.JDBCDemo.DisconnectedArchitecture;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class SelectDemo {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Database Connected Sucessfully");
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl("jdbc:oracle:thin:@//Bhuwan:1521/XE");
            crs.setUsername("bhuwan");
            crs.setPassword("bhuwan");
            System.out.println("User connected sucessfully");

            //select query
            crs.setCommand("select * from allbooks");

            //executing the command
            crs.execute();

            //connection disconnected and now printing the values
            while (crs.next()){
                int bookId = crs.getInt(1);
                String bookName = crs.getString(2);
                String subject  = crs.getString(3);
                double bookPrice = crs.getDouble(4);
                System.out.println(bookId + "\t\t" + bookName + "\t\t" + subject + "\t\t" + bookPrice);
            }
            System.out.println("Connection closed sucessfully");

        }catch(ClassNotFoundException cnf) {
            System.out.println("Sorry, We are unable to load the driver");
            cnf.printStackTrace();
            System.exit(1);
        } catch (SQLException se) {
            System.out.println("Error : " + se.getMessage());
            se.printStackTrace();
            System.exit(1);
        }
    }
}
