/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.addAdmin;
import view.addStudent;
import view.home;
import view.showAdmin;
import view.showStudent;
import view.Option;

/**
 *
 * @author Somasiri
 */
public class HomeController {

    private home ho;

    public HomeController() {

        this.ho = new home();
        ho.getjButton1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ho.getjButton4().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ho.getjButton3().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ho.getjButton6().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        ho.getjButton2().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ho.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ho.setVisible(false);
//              addStudent object = new addStudent();
//              object.setVisible(true);
        new AddStudentController();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ho.setVisible(false);
//        addAdmin object = new addAdmin();
//        object.setVisible(true);
        new AddAdminController();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ho.setVisible(false);
//        showStudent object = new showStudent();
//        object.setVisible(true);
        new ShowStudentController();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ho.setVisible(false);
//        showAdmin object = new showAdmin();
//        object.setVisible(true);
        new ShowAdminController();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ho.setVisible(false);
//        Option object = new Option();
//        object.setVisible(true);
        new OptionController();
    }
}
