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
public class PassengerPojo {
    private String pid;
    private String name;
    private String contact;
    private char gender;
    private String userId;

    public PassengerPojo() {
    }

    public PassengerPojo(String pid, String name, String contact, char gender) {
        this.pid = pid;
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }

    public PassengerPojo(String pid, String name, String contact, char gender, String userId) {
        this.pid = pid;
        this.name = name;
        this.contact = contact;
        this.gender = gender;
        this.userId = userId;
    }
    

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
            
}
