/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Database.DBHelper;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.*;

/**
 *
 * @author respect
 */
public class register {
    public void newUser(String email, String kadi, String pass) throws SQLException {
        Connection conn = null;
        DBHelper helper = new DBHelper();
        PreparedStatement statement = null;
        try {
            conn = helper.getConnection();
            String sql = "insert into user (username, email, password) values(?,?,?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, kadi);
            statement.setString(2, email);
            statement.setString(3, pass);
            int result = statement.executeUpdate();
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        } finally {
            conn.close();
            statement.close();
        }
    }
}
