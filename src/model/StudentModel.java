/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Somasiri
 */
public class StudentModel {
    private String stdName;
    private String garanterName;
    private String stdNo;
    private String gNumber;
    private String stdCity;
    private String stdIntake;

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getGaranterName() {
        return garanterName;
    }

    public void setGaranterName(String garanterName) {
        this.garanterName = garanterName;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getgNumber() {
        return gNumber;
    }

    public void setgNumber(String gNumber) {
        this.gNumber = gNumber;
    }

    public String getStdCity() {
        return stdCity;
    }

    public void setStdCity(String stdCity) {
        this.stdCity = stdCity;
    }

    public String getStdIntake() {
        return stdIntake;
    }

    public void setStdIntake(String stdIntake) {
        this.stdIntake = stdIntake;
    }

    @Override
    public String toString() {
        return "StudentModel{" + "stdName=" + stdName + ", garanterName=" + garanterName + ", stdNo=" + stdNo + ", gNumber=" + gNumber + ", stdCity=" + stdCity + ", stdIntake=" + stdIntake + '}';
    }
            
    
    
            
}
