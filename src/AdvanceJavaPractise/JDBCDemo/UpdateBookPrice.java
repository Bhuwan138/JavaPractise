package AdvanceJavaPractise.JDBCDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateBookPrice {
    public static void main(String[] args) {
        Connection conn;

        try {
            conn =  Conn.getConnection();
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = statement.executeQuery("SELECT subject,book_price from allbooks");
            int count = 0;
            while (rs.next()){
                String subject = rs.getString(1);
                if(subject.equalsIgnoreCase("Java")){
                    double amt = rs.getDouble(2);
                    amt += amt*0.1;
                    rs.updateDouble(2,amt);
                    rs.updateRow();
                    ++count;
                }
            }

            if(count == 0)
                System.out.println("Amount is not updated");
            else
                System.out.println(count + " book amount is updated");
        } catch (SQLException e) {
            System.out.println("Error in connection");
        }

    }


}
