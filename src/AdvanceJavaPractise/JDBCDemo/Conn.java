package AdvanceJavaPractise.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static Connection conn;

    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//Bhuwan:1521/XE", "bhuwan", "bhuwan");
            System.out.println("Database Connected Sucessfully");

        } catch (ClassNotFoundException cnf) {
            System.out.println("Sorry, We are unable to load the driver");
            cnf.printStackTrace();
            System.exit(1);
        } catch (SQLException se) {
            System.out.println("Error to connect with database");
            se.printStackTrace();
            System.exit(1);
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() {
        try {
            conn.close();
        } catch (SQLException se) {
            System.out.println("Unable to close Database!!");
            se.printStackTrace();
        }
    }
}
