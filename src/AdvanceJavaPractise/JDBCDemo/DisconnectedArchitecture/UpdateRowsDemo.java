package AdvanceJavaPractise.JDBCDemo.DisconnectedArchitecture;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class UpdateRowsDemo {
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

            //updating the value
            int cnt = 0;
            double amount;
            while (crs.next()) {
                double bookPrice = crs.getDouble(4);
                amount = bookPrice + bookPrice * 0.2;
                crs.updateDouble(4, amount);
                crs.updateRow();
                cnt++;
            }
            crs.acceptChanges();
            System.out.println("Total " + cnt + " row updated");

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
