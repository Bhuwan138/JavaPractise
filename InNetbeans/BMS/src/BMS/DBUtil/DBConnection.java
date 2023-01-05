package BMS.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhuwan Pandey
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//BHUWAN:1521/XE","bms","bms");
            JOptionPane.showMessageDialog(null, "Database Connected Sucessfully" , "DB connected" , JOptionPane.INFORMATION_MESSAGE);

        }
        catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null, "Sorry, We are unable to load the driver" , "Driver Error!!!" , JOptionPane.ERROR);
            cnf.printStackTrace();
            System.exit(1);
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Sorry, We are unable to connect to database" , "Database Error!!!" , JOptionPane.ERROR);
            se.printStackTrace();
            System.exit(1);
        } 
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Unable to close Database!!" , "Error!!!" , JOptionPane.ERROR);
            se.printStackTrace();
        }
    }
}
