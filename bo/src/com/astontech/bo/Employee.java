package com.astontech.bo;

import java.util.Date;

public class Employee extends Person {

    //Parameters - Employee
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;

    //Constructors
    public Employee() {}

    public Employee(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Employee(int employeeId, String firstName){
        this.setFirstName(firstName);
    }

    public Employee(String lastName){
        this.setLastName(lastName);
    }

    //Getters and Setters
    //Employee ID
    public void setEmployeeId(int employeeId){
        this.EmployeeId = employeeId;
    }

    public int getEmployeeId(){
        return this.EmployeeId;
    }

    //Hire Date
    public void setHireDate(Date hireDate){
        this.HireDate = hireDate;
    }

    public Date getHireDate(){
        return this.HireDate;
    }

    //Termination Date
    public void setTermDate(Date termDate){
        this.TermDate = termDate;
    }

    public Date getTermDate(){
        return this.TermDate;
    }



}
