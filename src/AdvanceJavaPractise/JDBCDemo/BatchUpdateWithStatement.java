package AdvanceJavaPractise.JDBCDemo;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdateWithStatement {
    public static void main(String[] args) {
        Connection conn = null;
        boolean ans = true;
        try{
            conn = Conn.getConnection();
            Statement statement = conn.createStatement();
            conn.setAutoCommit(false);

            statement.addBatch("insert into allbooks values(106,'Java SE','Java',500)");
            statement.addBatch("update emp set salary = 4000 where empid = 193");
            statement.addBatch("delete from emp where empid > 194");

            int[] results = statement.executeBatch();
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
            System.out.println("Error in connecting with database");
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
