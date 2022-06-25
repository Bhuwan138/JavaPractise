/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.RoutePojo;
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
public class RouteDAO {
    
    public static String getRouteId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(rid) from routes");
        rs.next();
        String routeId = rs.getString(1); 
        if(routeId == null){
            return "R-101";
        }
        int routeNo = Integer.parseInt(routeId.substring(2));
        routeNo++;
        return "R-" + routeNo;
    }
    
    public static boolean addRoute(RoutePojo route) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into routes values(?,?,?,?,?,?,?)");
        ps.setString(1, route.getRid());
        ps.setString(2, route.getSource());
        ps.setString(3, route.getBusno());
        ps.setDate(4, route.getDepartureDate());
        ps.setString(5, route.getDepartureTime());
        ps.setInt(6, route.getCost());
        ps.setString(7, route.getDestination());
        return ps.executeUpdate() == 1;
    }
    
    public static boolean updateRoute(RoutePojo route) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update routes set source = ?, busno = ?, departure_date = ?, departure_time = ?,cost = ?, destination = ? where rid = ?");
        ps.setString(1, route.getSource());
        ps.setString(2, route.getBusno());
        ps.setDate(3, route.getDepartureDate());
        ps.setString(4, route.getDepartureTime());
        ps.setInt(5, route.getCost());
        ps.setString(6, route.getDestination());
        ps.setString(7, route.getRid());
        return ps.executeUpdate() == 1;
    }
    
    public static boolean deleteRoute(String routeId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from routes where rid = ?");
        ps.setString(1, routeId);
        return ps.executeUpdate() == 1;
    }
    
    public static List<RoutePojo> getAllRoutes() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from routes");
        List<RoutePojo> routes = new ArrayList<>();
        while(rs.next()){
            RoutePojo route = new RoutePojo();
            route.setRid(rs.getString(1));
            route.setSource(rs.getString(2));
            route.setBusno(rs.getString(3));
            route.setDepartureDate(rs.getDate(4));
            route.setDepartureTime(rs.getString(5));
            route.setCost(rs.getInt(6));
            route.setDestination(rs.getString(7));
            routes.add(route);
        }
        return routes;
    }
}
