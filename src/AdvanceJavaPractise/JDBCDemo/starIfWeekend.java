package AdvanceJavaPractise.JDBCDemo;

import java.sql.*;
import java.text.SimpleDateFormat;

public class starIfWeekend {
    public static void main(String[] args) {
        Connection conn;
        try{
            conn = Conn.getConnection();
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = statement.executeQuery("Select name, hiredate from emp");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE-dd-MMM-yyyy");
            while (rs.next()){
                String name = rs.getString(1);
                Date date = rs.getDate(2);
                if(date.getDay() == 6 || date.getDay() == 0)
                    name = "*" + name;
                System.out.println(name + "\t" + simpleDateFormat.format(date));
            }
        }
        catch(SQLException e){
            System.out.println("Error in connecting to database");
        }
    }
}
