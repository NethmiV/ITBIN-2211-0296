/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import view.databaseConnection;
import view.home;
import view.showAdmin;

/**
 *
 * @author Somasiri
 */
public class ShowAdminController {

      private showAdmin showAd;
    private Connection conn = null;
    
    public ShowAdminController() {
        
                conn = databaseConnection.connection();
         this.showAd = new showAdmin();
         
                 showAd.getjButton4().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
                 showAd.setVisible(true);
    }
    
        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        showAd.setVisible(false);
        new HomeController();

    } 
    
    
    
}
