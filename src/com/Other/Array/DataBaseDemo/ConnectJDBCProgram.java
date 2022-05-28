package com.Other.Array.DataBaseDemo;

import java.sql.*;

public class ConnectJDBCProgram {
    public static void main(String[] args) {
       Connection connection = null;
       try{
           Class.forName("oracle.jdbc.OracleDriver");
           connection = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-NJEF0DJ:1521/XE","student","student");
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery("select * from student_info");
           while (rs.next()){
               int id = rs.getInt(1);
               String name = rs.getString(2);
               String address = rs.getString(3);
               long number = rs.getLong(4);
               System.out.println(id + "\t" + name + "\t" + address + "\t" + number);
           }
       }
       catch (ClassNotFoundException cnf){
           System.out.println("Failed to connect to the database");
           System.out.println(cnf.getMessage());
       }
       catch (SQLException se){
           System.out.println("Failed to load the driver");
           System.out.println(se.getMessage());
       }

       finally {

           if(connection != null){
               try {
                   connection.close();
               }
               catch (SQLException se){
                   System.out.println("Problem in Closing the Database Connection");
                   System.out.println(se.getMessage());
               }
           }
       }
    }
}
