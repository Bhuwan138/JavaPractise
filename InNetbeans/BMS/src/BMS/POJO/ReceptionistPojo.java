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
public class ReceptionistPojo {
    private String empId;
    private String empName;
    private String userId;
    private String job;
    private double salary;

    public ReceptionistPojo() {
    }

    public ReceptionistPojo(String empId, String empName, String userId, String job, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.userId = userId;
        this.job = job;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
