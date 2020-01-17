package com.astontech.bo;

import java.util.Date;

public class Vehicle extends BaseBO {

    //Parameters
    private int VehicleId;
    private int Year;
    private String LicensePlate;
    private String VIN;
    private String Color;
    private boolean IsPurchase;
    private int PurchasePrice;
    private Date PurchaseDate;

    //Constructors
    public Vehicle(){}

    public Vehicle(int vehicleId, int year, String licensePlate, String vin, String color, boolean isPurchase, int purchasePrice, Date purchaseDate){
        this.setVehicleId(vehicleId);
        this.setYear(year);
        this.setLicensePlate(licensePlate);
        this.setVIN(vin);
        this.setColor(color);
        this.setIsPurchase(isPurchase);
        this.setPurchasePrice(purchasePrice);
        this.setPurchaseDate(purchaseDate);
    }

    public Vehicle(int year, String color, int purchasePrice){
        this.setYear(year);
        this.setColor(color);
        this.setPurchasePrice(purchasePrice);
    }


    //Getters and Setters
    //Vehicle ID
    public void setVehicleId(int vehicleId){
        this.VehicleId = vehicleId;
    }
    public int getVehicleId(){
        return this.VehicleId;
    }

    //Year
    public void setYear(int year){
        this.Year = year;
    }
    public int getYear(){
        return this.Year;
    }

    //License Plate
    public void setLicensePlate(String licensePlate){
        this.LicensePlate = licensePlate;
    }
    public String getLicensePlate(){
        return this.LicensePlate;
    }

    //VIN
    public void setVIN(String vin){
        this.VIN = vin;
    }
    public String getVIN(){
        return this.VIN;
    }

    //Color
    public void setColor(String color){
        this.Color = color;
    }
    public String getColor(){
        return this.Color;
    }

    //Is Purchase
    public void setIsPurchase(boolean isPurchase){
        this.IsPurchase = isPurchase;
    }
    public boolean getIsPurchase(){
        return this.IsPurchase;
    }

    //Purchase Price
    public void setPurchasePrice(int purchasePrice){
        this.PurchasePrice = purchasePrice;
    }
    public int getPurchasePrice(){
        return this.PurchasePrice;
    }

    //Purchase Date
    public void setPurchaseDate(Date purchaseDate){
        this.PurchaseDate = purchaseDate;
    }
    public Date getPurchaseDate(){
        return this.PurchaseDate;
    }

    //Custom Methods


}
