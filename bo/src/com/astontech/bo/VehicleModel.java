package com.astontech.bo;

public class VehicleModel extends Vehicle {

    //Parameters
    private int VehicleModelId;
    private String VehicleModel;

    //Constructors
    public VehicleModel(){}

    public VehicleModel(int vehicleModelId, String vehicleModel){
        this.setVehicleModelId(vehicleModelId);
        this.setVehicleModel(vehicleModel);
    }

    //Getters and Setters
    //Vehicle Model Id
    public void setVehicleModelId(int vehicleModelId){
        this.VehicleModelId = vehicleModelId;
    }
    public int getVehicleModelId(){
        return this.VehicleModelId;
    }

    //Vehicle Model
    public void setVehicleModel(String vehicleModel){
        this.VehicleModel = vehicleModel;
    }
    public String getVehicleModel(){
        return this.VehicleModel;
    }


    //Custom Methods
}
