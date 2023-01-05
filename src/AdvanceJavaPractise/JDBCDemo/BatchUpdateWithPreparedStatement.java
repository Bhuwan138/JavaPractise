package AdvanceJavaPractise.JDBCDemo;

import java.sql.*;
import java.util.Scanner;

public class BatchUpdateWithPreparedStatement {
    public static void main(String[] args) {
        Connection conn = null;
        boolean ans = true;
        Scanner scanner = new Scanner(System.in);
        try{
            conn = Conn.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("insert into dept values(?,?,?)");
            conn.setAutoCommit(false);
            String choice = null;
            do{
                System.out.println("Enter department no : ");
                int deptNo = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter department name : ");
                String deptName = scanner.nextLine();
                System.out.println("Enter location : ");
                String location = scanner.nextLine();
                preparedStatement.setInt(1,deptNo);
                preparedStatement.setString(2,deptName);
                preparedStatement.setString(3,location);
                preparedStatement.addBatch();
                System.out.println("Do you want to insert more record (Y/N) : ");
                choice = scanner.next();
            }while (choice.equalsIgnoreCase("y"));

            preparedStatement.executeBatch();

            int[] results = preparedStatement.executeBatch();
            int queryno = 1;
            for(int result : results){
                switch (result){
                    case Statement.SUCCESS_NO_INFO -> System.out.println("Query no " + queryno + " effected unknown number of rows");
                    case Statement.EXECUTE_FAILED -> System.out.println("Query no " + queryno + " did not run properly");
                    default -> System.out.println("Query no" + queryno + " effected " + result + " rows");
                }
                queryno++;
            }

        } catch (BatchUpdateException batchUpdateException){
            ans = false;
            System.out.println("Batch generated exception " + batchUpdateException.getMessage());

        } catch (SQLException sqlException){
            System.out.println("Error in connecting with database : " + sqlException.getMessage());
        }

        finally {
            if(conn != null){
                try{
                    if(ans){
                        conn.commit();
                        System.out.println("Transection Commited sucessfully");
                    }else {
                        conn.rollback();
                        System.out.println("Transection Rollbacked");
                    }
                    conn.close();
                    System.out.println("Connectin closed sucessfully");
                } catch (SQLException e) {
                    System.out.println("Problem in closing connection");
                }
            }
        }
    }
}
