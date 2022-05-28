/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMS.DAO;

import BMS.DBUtil.DBConnection;
import BMS.POJO.EmployeesPojo;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Bhuwan Pandey
 */
public class EmployeesDAO {
    //to generate employeeId

    /**
     *
     * @return
     * @throws SQLException
     */
    public static String getEmployeeId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(empid) from employees");
        rs.next();
        String empId = rs.getString(1); 
        int empNo = Integer.parseInt(empId.substring(1));
        empNo++;
        return "E" + empNo;
    }
    
     //to add employee
    public static boolean addEmployee(EmployeesPojo addEmp) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into employees values(?,?,?,?,?,?)");
        ps.setString(1, addEmp.getEmployeeId());
        ps.setString(2, addEmp.getEmployeeName());
        ps.setString(3, addEmp.getJob());
        ps.setDouble(4, addEmp.getSalary());
        ps.setString(5, addEmp.getEmail());
        ps.setString(6, addEmp.getContact());
        int result = ps.executeUpdate();
        return result == 1;
    }
    
    public static List<EmployeesPojo> getAllEmployee()throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs  =  st.executeQuery("select * from employees");
        List<EmployeesPojo> emp = new ArrayList<>();
        while(rs.next()){
            EmployeesPojo empList = new EmployeesPojo();
            empList.setEmployeeId(rs.getString(1));
            empList.setEmployeeName(rs.getString(2));
            empList.setJob(rs.getString(3));
            empList.setSalary(rs.getDouble(4));
            empList.setEmail(rs.getString(5));
            empList.setContact(rs.getString(6));
            emp.add(empList);
        }    
        return emp;
    }
    
    public static List<String> getAllEmpId() throws SQLException{
        Connection conn  = DBConnection.getConnection();
        Statement ps = conn.createStatement();
        ResultSet rs = ps.executeQuery("select empid from employees order by empid");
        List<String> empId = new ArrayList<>();
        while(rs.next()){
            empId.add(rs.getString(1));
        }
        return empId;
    }
    
    public static EmployeesPojo findEmpById(String empId) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from employees where empid = ?");
        ps.setString(1, empId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        EmployeesPojo emp = new EmployeesPojo();
        emp.setEmployeeId(rs.getString(1));
        emp.setEmployeeName(rs.getString(2));
        emp.setJob(rs.getString(3));
        emp.setSalary(rs.getDouble(4));
        emp.setEmail(rs.getString(5));
        emp.setContact(rs.getString(6));
        return emp;
    } 
    
    public static boolean updateEmployee(EmployeesPojo emp)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update employees set empname = ?, job = ?, salary = ? where empid = ?");
        ps.setString(4, emp.getEmployeeId());
        ps.setString(1, emp.getEmployeeName());
        ps.setString(2, emp.getJob());
        ps.setDouble(3, emp.getSalary());
        ps.setString(5, emp.getEmail());
        ps.setString(6, emp.getContact());
        int result = ps.executeUpdate();
        if(result == 0)
            return false;
        else{
            boolean resultIsUser = UserDAO.isUserPresent(emp.getEmployeeId());
            if(resultIsUser == false)
                return true;
            ps = conn.prepareStatement("update users set usertype = ?, username = ? where empid = ?");
            ps.setString(3, emp.getEmployeeId());
            ps.setString(1, emp.getJob());
            ps.setString(2, emp.getEmployeeName());
            int resultUser = ps.executeUpdate();
            return resultUser==1; 
        }
        
    }
    
    public static boolean deleteEmployee(String empId)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from employees where empid = ?");
        ps.setString(1, empId);
        int result = ps.executeUpdate();
        return result ==1;
    }
    
}
