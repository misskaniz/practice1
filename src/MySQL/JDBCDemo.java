package MySQL;

import java.sql.*;

public class JDBCDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/coffee";
    private static final String USER = "root";
    private static final String PASSWORD = "abc";

    public static void main(String[] args) {
        try {


            // 1. get connection to database
            Connection myConn = DriverManager.getConnection(URL, USER, PASSWORD);

            // 2. create statement
            Statement myStmt = myConn.createStatement();


            // 3. execute a SQL Query
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM Drinks");


            // 4. Process the result set
            while (myRs.next()) {
                System.out.println("Size" + " " + myRs.getString("Size" ) + " " + myRs.getString ("DrinkName") + " " + myRs.getString("TypeOfDrink"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}