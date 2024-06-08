/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.AdminModel;
import view.addAdmin;
import view.databaseConnection;
import view.home;
import view.login;

/**
 *
 * @author Somasiri
 */
public class AddAdminController {

    private addAdmin adn;
    private Connection conn = null;
    private AdminDao adminDao;
    
    public AddAdminController() {

        conn = databaseConnection.connection();

        this.adn = new addAdmin();
        this.adminDao = new AdminDao();

        adn.getjButton1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, adn.getAdminName(), adn.getMail(), adn.getPassword(), adn);
            }
        });

        adn.getjButton2().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        adn.setVisible(true);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, JTextField name, JTextField mail, JPasswordField password, addAdmin adn) {
        // TODO add your handling code here:
        try {
//            Statement stmt = conn.createStatement();
//            String adminName = name.getText();
//            String adminMail = mail.getText();
//            String adminPass = password.getText();
//            
            AdminModel adm = new AdminModel();

            adm.setAdminName(name.getText());
            adm.setAdminMail(mail.getText());
            adm.setAdminPass(password.getText());

//            String sql = "INSERT INTO ADMIN (name, mail, password) VALUES('"+adminName+"', '"+adminMail+"', '"+adminPass+"')";
//
//            stmt.executeUpdate(sql);

            adminDao.AddAdmin(adm);
            JOptionPane.showMessageDialog(null, "Data is successfuly inserted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        adn.setVisible(false);
        new HomeController();

    }
}
