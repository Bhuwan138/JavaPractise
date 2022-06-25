/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.BusPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhuwan Pandey
 */
public class BusDAO {
    
    public static String getBusId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(busno) from buses");
        rs.next();
        String busId = rs.getString(1); 
        if(busId == null){
            return "B101";
        }
        int busNo = Integer.parseInt(busId.substring(1));
        busNo++;
        return "B" + busNo;
    }
    
    public static boolean addBus(BusPojo addBus)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into buses values(?,?,?,?,'Y')");
        ps.setString(1, addBus.getBusNo());
        ps.setString(2, addBus.getBusCompany());
        ps.setInt(3, addBus.getSeat());
        ps.setString(4, addBus.getType());
        int result = ps.executeUpdate();
        return result == 1;
    }
    
    public static boolean deleteBus(String pId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update buses set status = 'N' where busno = ?");
        ps.setString(1, pId);
        return ps.executeUpdate() == 1;
    }
    
    public static boolean updateBus(BusPojo bus)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update buses set buscompany = ?, seat = ?, type = ? where busno = ?");
        ps.setString(1, bus.getBusCompany());
        ps.setInt(2, bus.getSeat());
        ps.setString(3, bus.getType());
        ps.setString(4, bus.getBusNo());
        return ps.executeUpdate() == 1;
    }
    
    public static List<BusPojo> getBusDetails() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from buses where status = 'Y' order by busno");
        List<BusPojo> b = new ArrayList<>();
        while(rs.next()){
            BusPojo bus = new BusPojo();
            bus.setBusNo(rs.getString(1));
            bus.setBusCompany(rs.getString(2));
            bus.setSeat(rs.getInt(3));
            bus.setType(rs.getString(4));
            b.add(bus);
        }
        return b;
    }
    
    
    
}
