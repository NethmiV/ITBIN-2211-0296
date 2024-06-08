/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.LoginModel;
import view.databaseConnection;
import view.home;
import view.login;

/**
 *
 * @author Somasiri
 */
public class LoginController {

    private Connection conn = null;
    private login lo;
    private LoginDao loginDao;
    
    public LoginController() {
        conn = databaseConnection.connection();
        this.loginDao = new LoginDao();
        
        login log = new login();
        
        log.getCancel().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        log.setVisible(true);

        log.getLogin().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt, log.getEmail(), log.getPassword(),log);
            }
        });
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.exit(0);

    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt, JTextField email, JPasswordField password, login log) {
        // TODO add your handling code here:
        try {

//            Statement stmt = conn.createStatement();
//            String userEmail = email.getText();
//            String userPass = password.getText();
//            
            LoginModel lo = new LoginModel();
            
            lo.setUserEmail(email.getText());
            lo.setUserPass(password.getText());

//            String sql = "SELECT * FROM admin WHERE mail='" + userEmail + "' && password = '" + userPass + "'";
//
//            ResultSet rs = stmt.executeQuery(sql);
            
            ResultSet rs = loginDao.login(lo);
            
            if (rs.next()) {
                log.setVisible(false);
//                home object = new home();
//                object.setVisible(true);
                new HomeController();
            } else {
                JOptionPane.showMessageDialog(null, "password or email is invalid.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
