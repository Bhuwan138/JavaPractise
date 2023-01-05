/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.POJO;


public class EmployeesPojo {
    private String employeeId;
    private String employeeName;
    private String Job;
    private double Salary;
    private String email;
    private String contact;

    public EmployeesPojo() {
    }

    public EmployeesPojo(String employeeId, String employeeName, String Job, double Salary, String email, String contact) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.Job = Job;
        this.Salary = Salary;
        this.email = email;
        this.contact = contact;
    }

    

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}
