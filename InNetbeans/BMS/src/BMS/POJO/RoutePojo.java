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
public class RoutePojo {
    private String rid;
    private String source;
    private String busno;
    private Date departureDate;
    private String departureTime;
    private int cost;
    private String destination;

    public RoutePojo() {
    }

    public RoutePojo(String rid, String source, String busno, Date departureDate, String departureTime, int cost, String destination) {
        this.rid = rid;
        this.source = source;
        this.busno = busno;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.cost = cost;
        this.destination = destination;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
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

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    
    
    
}
