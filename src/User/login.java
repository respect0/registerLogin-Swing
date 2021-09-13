/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.*;
import Database.*;
/**
 *
 * @author respect
 */
public class login {
    public boolean loginUser(String kadiEmail, String pass) throws SQLException {
        Connection conn = null;
        DBHelper helper = new DBHelper();
        String sql = "select username, email , password from user";
        Statement statement = null;
        ResultSet resultSet;
        try {
            conn = helper.getConnection();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                if((kadiEmail.equals(resultSet.getString("username"))|| kadiEmail.equals(resultSet.getString("email"))) && pass.equals(resultSet.getString("password"))) {
                    return true;
                } 
            }
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            conn.close();
            statement.close();
        }
        return false;
    }
}
