/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.Option;
import view.databaseConnection;
import java.sql.Statement;
import view.home;
import view.showStudent;

/**
 *
 * @author Somasiri
 */
public class OptionController {

    private Option op;
    private Connection conn = null;
    
    public OptionController() {
        
         conn = databaseConnection.connection();
         this.op = new Option();
         
            op.getSearch().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt, op.getsId(),op.getsName(), op.getSgName(), op.getsNumber(), op.getSgnumber(), op.getsCity(), op.getsIntake(), op);
            }
        });
            
            op.getUpdate().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
            
            op.getDelete().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt, op.getsId());
            }
        });
            
            op.getjButton2().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
            op.setVisible(true);
    }
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt, JTextField sId,JTextField sName, JTextField sgName, JTextField sNumber, JTextField sgnumber, JTextField sCity, JTextField sIntake, Option op) {                                       
        // TODO add your handling code here:
        try{
            Statement stmt = conn.createStatement();
            
            int stdId = Integer.parseInt(sId.getText());
            
            String sql = "SELECT * FROM STUDENT WHERE stdId = '"+stdId+"'";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                
                sName.setText(rs.getString("name"));
                sgName.setText(rs.getString("gName"));
                sNumber.setText(rs.getString("stdNumber"));
                sgnumber.setText(rs.getString("number"));
                sCity.setText(rs.getString("city"));
                sIntake.setText(rs.getString("intake"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Record not found.");
            }
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);}
    }
    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    
            JOptionPane.showMessageDialog(null,"Data is successfuly updated");
    }
    
     private void deleteActionPerformed(java.awt.event.ActionEvent evt, JTextField sId) {                                       
        // TODO add your handling code here:
        try{
            Statement stmt = conn.createStatement();
            
            int stdId = Integer.parseInt(sId.getText());
            
            String sql = "DELETE FROM STUDENT WHERE stdId = '"+stdId+"'";
            
            stmt.executeUpdate(sql);
             op.setVisible(false);
        showStudent object = new showStudent();
        object.setVisible(true);
        
        }catch(Exception e){JOptionPane.showMessageDialog(null,e);}
           
    }
    
         
         private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        op.setVisible(false);
        new HomeController();

    }
}
