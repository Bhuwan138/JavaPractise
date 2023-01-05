package AdvanceJavaPractise.JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sendDateToDatabase {
    public static void main(String[] args) {
        Connection conn = null;
        Scanner sc = new Scanner(System.in);
        try{
            conn = Conn.getConnection();

            //taking inputs
            System.out.println("Enter emp id");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name :");
            String name = sc.nextLine();

            System.out.println("Enter salary");
            int salary = sc.nextInt();

            System.out.println("Enter hiredate (dd-mm-yyyy)");
            String dateInString = sc.next();

            //convert string date into util date
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = simpleDateFormat.parse(dateInString);

            //converting util date into sql date
            long dateInMilliSecond = date.getTime();
            java.sql.Date dateInSQL = new java.sql.Date(dateInMilliSecond);

            //set records in database
            PreparedStatement ps =conn.prepareStatement("insert into emp values(?,?,?,?)");
            ps.setInt(1,empId);
            ps.setString(2,name);
            ps.setInt(3,salary);
            ps.setDate(4,dateInSQL);

            int ans = ps.executeUpdate();
            if(ans > 0) System.out.println("Record inserted " + ans);
            else System.out.println("Cannot insert record");

        } catch (ParseException e) {
            System.out.println("Invalid Date");
        }
        catch (SQLException e) {
            System.out.println("Error in Database : " + e);
        }
    }
}
