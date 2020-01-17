package com.astontech.bo;

import java.util.Date;

public class Address extends Person {

    //Parameters
    private int AddressId;
    private int ClientId;
    private int AddressNumber;
    private String Street;
    private String StreetTwo;
    private String City;
    private int StateId;
    private int CountryId;
    private Date DateCreate;

    //Constructors

    public Address(){}

    public Address(int addressId, int addressNumber, String street, String city, int stateId, int countryId){
        this.setAddressId(addressId);
        this.setAddressNumber(addressNumber);
        this.setStreet(street);
        this.setCity(city);
        this.setStateId(stateId);
        this.setCountryId(countryId);
    }

    public Address(int addressId){
        this.setAddressId(addressId);
    }

    //Getters and Setters
    //Address ID
    public void setAddressId(int addressId){
        this.AddressId = addressId;
    }
    public int getAddressId(){
        return this.AddressId;
    }

    //Client ID
    public void setClientId(int clientId){
        this.ClientId = clientId;
    }
    public int getClientId(){
        return this.ClientId;
    }

    //Address Number
    public void setAddressNumber(int addressNumber){
        this.AddressNumber = addressNumber;
    }
    public int getAddressNumber(){
        return this.AddressNumber;
    }

    //Street
    public void setStreet(String street){
        this.Street = street;
    }
    public String getStreet(){
        return this.Street;
    }
    //Street Two
    public void setStreetTwo(String streetTwo){
        this.StreetTwo = streetTwo;
    }
    public String getStreetTwo(){
        return this.StreetTwo;
    }

    //City
    public void setCity(String city){
        this.City = city;
    }
    public String getCity(){
        return this.City;
    }
    //State ID
    public void setStateId(int stateId){
        this.StateId = stateId;
    }
    public int getStateId(){
        return this.StateId;
    }

    //Country ID
    public void setCountryId(int countryId){
        this.CountryId = countryId;
    }
    public int getCountryId(){
        return this.CountryId;
    }

    //Date Create
    public void setDateCreate(Date dateCreate){
        this.DateCreate = dateCreate;
    }
    public Date getDateCreate(){
        return this.DateCreate;
    }


    //Custom Methods


}
