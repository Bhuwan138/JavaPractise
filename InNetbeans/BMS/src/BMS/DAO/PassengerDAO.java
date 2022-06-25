/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.PassengerPojo;
import BMS.POJO.UserProfile;
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
public class PassengerDAO {
    
    public static String getPassengerId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(pid) from passengers");
        rs.next();
        String passengerId = rs.getString(1); 
        if(passengerId == null){
            return "P-101";
        }
        int passengerNo = Integer.parseInt(passengerId.substring(2));
        passengerNo++;
        return "P-" + passengerNo;
    }
    
    public static boolean addPassenger(PassengerPojo p) throws SQLException{
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into passengers values(?,?,?,?,?)");
        ps.setString(1, p.getPid());
        ps.setString(2, p.getName());
        ps.setString(3, p.getContact());
        ps.setString(4, String.valueOf(p.getGender()));
        ps.setString(5, UserProfile.getUserId());
        return ps.executeUpdate() == 1;        
    }
    
    public static List<PassengerPojo> getAllPassenger()throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs  =  st.executeQuery("select * from passengers");
        List<PassengerPojo> p = new ArrayList<>();
        while(rs.next()){
            PassengerPojo passengerList = new PassengerPojo();
            passengerList.setPid(rs.getString(1));
            passengerList.setName(rs.getString(2));
            passengerList.setContact(rs.getString(3));
            passengerList.setGender(rs.getString(4).charAt(0));
            passengerList.setUserId(rs.getString(5));
            p.add(passengerList);
        }    
        return p;
    }
    
     public static List<PassengerPojo> getAllPassenger(String id)throws SQLException{
        Connection conn  = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from passengers where userid = ?");
        ps.setString(1, id);
        ResultSet rs  =  ps.executeQuery();
        List<PassengerPojo> p = new ArrayList<>();
        while(rs.next()){
            PassengerPojo passengerList = new PassengerPojo();
            passengerList.setPid(rs.getString(1));
            passengerList.setName(rs.getString(2));
            passengerList.setContact(rs.getString(3));
            passengerList.setGender(rs.getString(4).charAt(0));
            passengerList.setUserId(rs.getString(5));
            p.add(passengerList);
        }    
        return p;
    }
    
    public static boolean deletePassenger(String passengerId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from passengers where pid = ?");
        ps.setString(1, passengerId);
        return ps.executeUpdate() == 1;
    }
    
    public static boolean updatePassenger(PassengerPojo p) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update passengers set passenger_name = ?, contact = ?, gender = ? where pid = ?");
        ps.setString(1, p.getName());
        ps.setString(2, p.getContact());
        ps.setString(3, String.valueOf(p.getGender()));
        ps.setString(4, p.getPid());
        return ps.executeUpdate() == 1;
    }
    
    public static Map<String,String> getPassengerName() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs  =  st.executeQuery("select pid,passenger_name from passengers");
        Map<String,String> passengers = new HashMap<>();
        while(rs.next()){
            String id = rs.getString(1);
            String name = rs.getString(2);
            passengers.put(id, name);
        }
        return passengers;
    }
    
}
