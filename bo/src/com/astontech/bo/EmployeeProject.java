package com.astontech.bo;

import java.util.Date;

public class EmployeeProject extends Employee {

    //Parameters
    private int EmployeeProjectId;
    private int ProjectId;
    private int VehicleId;
    private Date StartDate;
    private Date EndDate;
    private String Notes;


    //Constructors
    public EmployeeProject() {
    }

    public EmployeeProject(int employeeProjectId, int projectId, String notes) {
        this.setEmployeeProjectId(employeeProjectId);
        this.setProjectId(projectId);
        this.setNotes(notes);
    }

    public EmployeeProject(int employeeProjectId) {
        this.setEmployeeProjectId(employeeProjectId);
    }


    //Getters and Setters
    //Employee Project ID
    public void setEmployeeProjectId(int employeeProjectId) {
        this.EmployeeProjectId = employeeProjectId;
    }

    public int getEmployeeProjectId() {
        return this.EmployeeProjectId;
    }

    //Project ID
    public void setProjectId(int projectId) {
        this.ProjectId = projectId;
    }

    public int getProjectId() {
        return this.ProjectId;
    }

    //Vehicle ID
    public void setVehicleId(int vehicleId) {
        this.VehicleId = vehicleId;
    }

    public int getVehicleId() {
        return this.VehicleId;
    }

    //Start Date
    public void setStartDate(Date startDate) {
        this.StartDate = startDate;
    }

    public Date getStartDate() {
        return this.StartDate;
    }

    //End Date
    public void setEndDate(Date endDate) {
        this.EndDate = endDate;
    }

    public Date getEndDate() {
        return this.EndDate;
    }

    //Notes
    public void setNotes(String notes) {
        this.Notes = notes;
    }

    public String getNotes() {
        return this.Notes;
    }


    //Custom Methods
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public String getNote() {
        if (isNullOrEmpty(this.Notes)) {
            return "There are no notes made.";
        } else {
            return this.Notes;
        }

    }
}





