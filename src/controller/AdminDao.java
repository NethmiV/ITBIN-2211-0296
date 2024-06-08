/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Statement;
import model.AdminModel;
import view.databaseConnection;

/**
 *
 * @author Somasiri
 */
public class AdminDao {
    private Connection conn = null;
    
    public AdminDao(){
        this.conn = databaseConnection.connection();
    }
    
    public void AddAdmin(AdminModel adn) throws Exception {
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO ADMIN (name, mail, password) VALUES('"+adn.getAdminName()+"', '"+adn.getAdminMail()+"', '"+adn.getAdminPass()+"')";
        stmt.executeUpdate(sql);
    }
}
