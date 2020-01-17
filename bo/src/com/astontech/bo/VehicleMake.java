package com.astontech.bo;

import java.util.Date;

public class VehicleMake extends VehicleModel {

    //Parameters
    private int VehicleMakeId;
    private String VehicleMake;
    private Date CreateDate;

    //Constructors
    public VehicleMake(){}

    public VehicleMake(int vehicleMakeId, String vehicleMake, Date createDate){
        this.setVehicleMakeId(vehicleMakeId);
        this.setVehicleMake(vehicleMake);
        this.setCreateDate(createDate);
    }

    //Getters and Setters
    //Vehicle Make ID
    public void setVehicleMakeId(int vehicleMakeId){
        this.VehicleMakeId = vehicleMakeId;
    }
    public int getVehicleMakeId(){
        return this.VehicleMakeId;
    }

    //Vehicle Make
    public void setVehicleMake(String vehicleMake){
        this.VehicleMake = vehicleMake;
    }
    public String getVehicleMake(){
        return this.VehicleMake;
    }

    //Entry Create Date
    public void setCreateDate(Date createDate){
        this.CreateDate = createDate;
    }
    public Date getCreateDate(){
        return this.CreateDate;
    }

    //Custom Methods

}
