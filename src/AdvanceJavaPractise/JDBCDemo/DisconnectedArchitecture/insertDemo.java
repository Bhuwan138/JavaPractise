package AdvanceJavaPractise.JDBCDemo.DisconnectedArchitecture;


import com.sun.rowset.CachedRowSetImpl;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class insertDemo {
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

            //inserting
            crs.moveToInsertRow();
            crs.updateInt("bookid",4);
            crs.updateString("book_name","Ruby with rails");
            crs.updateString("subject","ruby");
            crs.updateDouble("book_price",450);
            crs.insertRow();
            crs.moveToCurrentRow();
            crs.acceptChanges();


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
