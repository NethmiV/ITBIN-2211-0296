/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import javax.swing.JOptionPane;
import view.addStudent;
import view.databaseConnection;
import view.home;
import java.sql.Statement;
import javax.swing.JTextField;
import model.StudentModel;

/**
 *
 * @author Somasiri
 */
public class AddStudentController {

    private Connection conn = null;
    private addStudent ads;
    private StudentDao studentDao;

    public AddStudentController() {
        conn = databaseConnection.connection();
        this.studentDao = new StudentDao();

        this.ads = new addStudent();
        ads.getjButton1().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, ads.getStdName(), ads.getgName(), ads.getStdNumber(), ads.getNumber(), ads.getCity(), ads.getIntake(), ads);
            }
        });

        ads.getjButton2().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ads.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, JTextField name, JTextField gName, JTextField stdNumber, JTextField number, JTextField city, JTextField intake, addStudent ads) {
        // TODO add your handling code here:
        try {
//            Statement stmt = conn.createStatement();
//            String stdName = name.getText();
//            String garanterName = gName.getText();
//            String stdNo = stdNumber.getText();
//            String gNumber = number.getText();
//            String stdCity = city.getText();
//            String stdIntake = intake.getText();

            StudentModel std = new StudentModel();

            std.setStdName(name.getText());
            std.setGaranterName(gName.getText());
            std.setStdNo(stdNumber.getText());
            std.setgNumber(number.getText());
            std.setStdCity(city.getText());
            std.setStdIntake(intake.getText());

//            String sql = "INSERT INTO STUDENT(name,gName,stdNumber, number, city, intake) VALUES('" + stdName + "', '" + garanterName + "', '" + stdNo + "', '" + gNumber + "', '" + stdCity + "', '" + stdIntake + "')";
//
//            stmt.executeUpdate(sql);
//            
            
            studentDao.AddStudent(std);
            JOptionPane.showMessageDialog(null, "Data is successfuly inserted");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        ads.setVisible(false);
        new HomeController();

    }

}
