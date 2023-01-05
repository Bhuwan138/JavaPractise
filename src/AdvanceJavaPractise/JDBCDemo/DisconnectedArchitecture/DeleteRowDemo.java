package AdvanceJavaPractise.JDBCDemo.DisconnectedArchitecture;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRowDemo {
    public static void main(String[] args) {
        try {
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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter employee Id : ");
            int empId = scanner.nextInt();
            //deleting
            while(crs.next()){
                int id = crs.getInt(1);
                if(id == empId){
                    crs.deleteRow();
                    break;
                }
            }
            crs.acceptChanges();
            System.out.println("Record Deleted sucessfully");


            System.out.println("Connection closed sucessfully");

        } catch (ClassNotFoundException cnf) {
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
