package com.astontech.bo;

public class Phone extends Person{

    //Parameters
    private int PhoneId;
    private int AreaCode;
    private int PhoneNumber;

    //Constructors
    public Phone(){}

    public Phone(int phoneId, int areaCode, int phoneNumber){
        this.setPhoneId(phoneId);
        this.setAreaCode(areaCode);
        this.setPhoneNumber(phoneNumber);
    }

    //Getters and Setters
    //Phone ID
    public void setPhoneId(int phoneId){
        this.PhoneId = phoneId;
    }
    public int getPhoneId(){
        return this.PhoneId;
    }

    //Area Code
    public void setAreaCode(int areaCode){
        this.AreaCode = areaCode;
    }
    public int getAreaCode(){
        return this.AreaCode;
    }

    //Phone Number
    public void setPhoneNumber(int phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return this.PhoneNumber;
    }

    //Custom Methods


}
