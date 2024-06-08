/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import view.databaseConnection;
import view.home;
import view.showStudent;

/**
 *
 * @author Somasiri
 */
public class ShowStudentController {

    private showStudent show;
    private Connection conn = null;

    public ShowStudentController() {

        conn = databaseConnection.connection();
        this.show = new showStudent();

        show.getjButton1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        show.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        show.setVisible(false);
        new HomeController();
    }

}
