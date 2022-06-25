/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.TicketPojo;
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
public class TicketDAO {
    
    public static String getTicketId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(ticket_no) from tickets");
        rs.next();
        String ticketId = rs.getString(1); 
        if(ticketId == null){
            return "TKT101";
        }
        int ticketNo = Integer.parseInt(ticketId.substring(3));
        ticketNo++;
        return "TKT" + ticketNo;
    }
    
    public static boolean bookTicket(TicketPojo ticket) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into tickets values (?,?,?,?,?,?,?,?)");
        ps.setString(1, ticket.getTicket_no());
        ps.setString(2, ticket.getPid());
        ps.setDate(3, ticket.getDay());
        ps.setString(4, ticket.getTime());
        ps.setString(5, ticket.getBusno());
        ps.setString(6, ticket.getSource());
        ps.setString(7, ticket.getDestination());
        ps.setInt(8, ticket.getPrice());
        return ps.executeUpdate() == 1;
    }
    
    public static boolean updateTicket(TicketPojo ticket) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update tickets set pid = ?, day = ?,time = ?,busno = ?,source = ?,destination = ?,price = ? where ticket_no = ?");
        ps.setString(1, ticket.getPid());
        ps.setDate(2, ticket.getDay());
        ps.setString(3, ticket.getTime());
        ps.setString(4, ticket.getBusno());
        ps.setString(5, ticket.getSource());
        ps.setString(6, ticket.getDestination());
        ps.setInt(7, ticket.getPrice());
        ps.setString(8, ticket.getTicket_no());
        return ps.executeUpdate() == 1;
    }
    
    public static boolean calcelTicket(String ticketId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from tickets where ticket_no = ?");
        ps.setString(1, ticketId);
        return ps.executeUpdate() == 1;
    }
    
    public static List<TicketPojo> getAllTickets() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from tickets");
        List<TicketPojo> tickets = new ArrayList<>();
        while(rs.next()){
            TicketPojo ticket = new TicketPojo();
            ticket.setTicket_no(rs.getString(1));
            ticket.setPid(rs.getString(2));
            ticket.setDay(rs.getDate(3));
            ticket.setTime(rs.getString(4));
            ticket.setBusno(rs.getString(5));
            ticket.setSource(rs.getString(6));
            ticket.setDestination(rs.getString(7));
            ticket.setPrice(rs.getInt(8));
            tickets.add(ticket);
        }
        return tickets;
    }
    
    
}
