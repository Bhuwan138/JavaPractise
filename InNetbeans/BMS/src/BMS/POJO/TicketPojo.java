/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.POJO;

import java.sql.Date;

/**
 *
 * @author Bhuwan Pandey
 */
public class TicketPojo {
    private String ticket_no;
    private String pid;
    private Date day;
    private String time;
    private String busno;
    private String source;
    private String destination;
    private int price;

    public TicketPojo() {
    }

    public TicketPojo(String ticket_no, String pid, Date day, String time, String busno, String source, String destination, int price) {
        this.ticket_no = ticket_no;
        this.pid = pid;
        this.day = day;
        this.time = time;
        this.busno = busno;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public String getTicket_no() {
        return ticket_no;
    }

    public void setTicket_no(String ticket_no) {
        this.ticket_no = ticket_no;
    }

    

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    
    
}
