/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.ReceptionistPojo;
import BMS.POJO.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bhuwan Pandey
 */
public class ReceptionistDAO {
    public static Map<String, String> getNonRegisteredReceptionist() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select empid,empname from employees where job = 'Receptionist' and empid not in (select empid from users where usertype='Receptionist') ");
        Map<String,String> nonRegId =new HashMap<>();
        while(rs.next()){
            String id = rs.getString(1);
            String name = rs.getString(2);
            nonRegId.put(id, name);
        }
        return nonRegId;
    }
    
    public static boolean addReceptionist(UserPojo user)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getEmpId());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUserType());
        ps.setString(5, user.getUserName());
        int result = ps.executeUpdate();
        return result == 1;
    } 
    
    public static List<ReceptionistPojo> findAllReceptionist() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select users.empid,username,userid,job,salary from users,employees where usertype = 'Receptionist' and users.empid = employees.empid");
        List<ReceptionistPojo> allEmp = new ArrayList<>();
        while(rs.next()){
            ReceptionistPojo rp = new ReceptionistPojo();
            rp.setEmpId(rs.getString(1));
            rp.setEmpName(rs.getString(2));
            rp.setUserId(rs.getString(3));
            rp.setJob(rs.getString(4));
            rp.setSalary(rs.getDouble(5));
            allEmp.add(rp);
        }
        return allEmp;
    }
    
      
    public static List<String> getAllReceptionistId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery("select empid from users where usertype = 'Receptionist' order by empid");
        List<String> empId = new ArrayList<>();
        while(rs.next()){
            empId.add(rs.getString(1));
        }
        return empId;
    }
    
    public static ReceptionistPojo findEmpById(String empId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select users.empid,empname,userid,job,salary from users,employees where users.empid = ? and usertype = 'Receptionist' and users.empid = employees.empid");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        ReceptionistPojo receptionist = new ReceptionistPojo();
        receptionist.setEmpId(rs.getString(1));
        receptionist.setEmpName(rs.getString(2));
        receptionist.setUserId(rs.getString(3));
        receptionist.setJob(rs.getString(4));
        receptionist.setSalary(rs.getDouble(5));
        return receptionist;
    } 
    
     public static boolean deleteReceptionists(String empId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from users where empid = ?");
        ps.setString(1, empId);
        int result = ps.executeUpdate();
        return result ==1;
    }
     
    public static Map<String, String> getReceptionistDetails() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select userid,username from users where usertype='Receptionist'");
        Map<String,String> userDetails =new HashMap<>();
        while(rs.next()){
            String id = rs.getString(1);
            String name = rs.getString(2);
            userDetails.put(id, name);
        }
        return userDetails;
    } 
     
    public static boolean updateReceptionists(String userId,String password) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password = ? where userid = ?");
        ps.setString(1, password);
        ps.setString(2, userId);
        return ps.executeUpdate() == 1;      
    }
 }
