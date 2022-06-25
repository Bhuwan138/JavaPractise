/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.EmployeesPojo;
import BMS.POJO.UserPojo;
import BMS.POJO.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bhuwan Pandey
 */
public class UserDAO {
    
    //checking for user id and pass to validate user
    public static boolean validateUser(UserPojo user)throws SQLException{
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String userName = rs.getString(5);
            UserProfile.setUserName(userName);
            return true;
        }
        return false;
    }
    
    public static boolean isUserPresent(String empId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select 1 from users where empid = ?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    public static String getRememberedId() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select userid from remember");
        if(rs.next())
            return rs.getString(1);
        else
            return null;
    }
    
    public static void setRememberedId(String id) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update remember set userid = ? where id = '1'");
        ps.setString(1, id);
        ps.executeUpdate();
    }
   
}
