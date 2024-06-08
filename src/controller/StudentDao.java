/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Statement;
import model.StudentModel;
import view.databaseConnection;

/**
 *
 * @author Somasiri
 */
public class StudentDao {

    private Connection conn = null;

    public StudentDao() {
        this.conn = databaseConnection.connection();
    }

    public void AddStudent(StudentModel std) throws Exception {
        System.out.println(std);
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO STUDENT(name,gName,stdNumber, number, city, intake) VALUES('" + std.getStdName() + "', '" + std.getGaranterName() + "', '" + std.getStdNo() + "', '" + std.getgNumber() + "', '" + std.getStdCity() + "', '" + std.getStdIntake() + "')";
        stmt.executeUpdate(sql);
    }

}
