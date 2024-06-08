/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.LoginModel;
import view.databaseConnection;

/**
 *
 * @author Somasiri
 */
public class LoginDao {

    private Connection conn = null;

    public LoginDao() {
        this.conn = databaseConnection.connection();
    }

    public ResultSet login(LoginModel login) throws Exception {
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM admin WHERE mail='" + login.getUserEmail() + "' && password = '" + login.getUserPass() + "'";
        ResultSet rs = stmt.executeQuery(sql);
        return rs;
    }
}
