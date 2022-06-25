/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.POJO;

/**
 *
 * @author Bhuwan Pandey
 */
public class BusPojo {
    private String busNo;
    private String busCompany;
    private int seat;
    private String type;

    public BusPojo() {
    }

    public BusPojo(String busNo, String busCompany, int seat, String type) {
        this.busNo = busNo;
        this.busCompany = busCompany;
        this.seat = seat;
        this.type = type;
    }
    
    

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getBusCompany() {
        return busCompany;
    }

    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
