import java.sql.*;
import java.util.Scanner;

class UpdateSQL{
	public static void main(String[] args){
		Connection conn = null;
		Scanner in = new Scanner(System.in);
		int count = 0;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-NJEF0DJ:1521/XE","student","student");
			PreparedStatement ps = conn.prepareStatement("Update student_info set ST_ADDRESS=? where ST_ID=?");
			System.out.print("Enter updated address of friend : ");
			String address = in.nextLine();
			ps.setString(1,address);
			System.out.println("Enter id of student : ");
			int id = in.nextInt();
			ps.setInt(2,id);
			System.out.println("BHuwan-------");
			int ans = ps.executeUpdate();
			System.out.println("BHuwan-------");
			if(ans==0) 
				System.out.println("Sorry address Not Updated"); 
			else 
				System.out.println(ans + " Addresses updated");
			
		}
		catch(ClassNotFoundException cnf){
			System.out.println("Unable to load driver\n "+ cnf.getMessage());
		}	
		catch(SQLException se){
			System.out.println("Unable to connect to the database" + se.getMessage());
		}

		finally{
			if(conn!=null){
				try{
					conn.close();
				}
				catch(SQLException se){
					System.out.println("Unable to close the database"+ se.getMessage());
				}
			}
		}
	}
}