package Database;

import java.sql.*;

public class DBHelper {
    private String userName="root";
    private String password="1234";
    private String dbUrl="jdbc:mysql://localhost:3306/registerlogin-swing";
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException e) {
        System.out.println(e.getMessage());
        System.out.println(e.getErrorCode());
    }
}

