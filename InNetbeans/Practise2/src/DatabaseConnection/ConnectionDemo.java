/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;


import javax.swing.*;

import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args) {
        Connection conn;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-77KNAK2:1521/XE","sarita","bhuwan");
            System.out.println("Sucessful...");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from information");
            rs.next();
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String address = rs.getString(3);
            long number = rs.getLong(4);
            System.out.println(id + "\t" + name + "\t" + address  + "\t" + number);
        }catch(ClassNotFoundException cnf){
            System.out.println("Error in finding class");
            cnf.printStackTrace();
        }catch (SQLException cnf){
            System.out.println("Unable to connect to database");
        }
    }
}
