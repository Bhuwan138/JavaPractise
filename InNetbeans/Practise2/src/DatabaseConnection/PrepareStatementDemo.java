package DatabaseConnection;

import java.sql.*;

public class PrepareStatementDemo {
    public static void main(String[] args) {
        Connection conn;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-77KNAK2:1521/XE","sarita","bhuwan");
            System.out.println("Sucessful...");

            System.out.println();
        }catch(ClassNotFoundException cnf){
            System.out.println("Error in finding class");
            cnf.printStackTrace();
        }catch (SQLException cnf){
            System.out.println("Unable to connect to database");
        }
    }
}
