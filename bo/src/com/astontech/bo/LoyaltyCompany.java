package com.astontech.bo;

public class LoyaltyCompany extends LoyaltyAccount {

    //Parameters
    private String CompanyName;
    private int LoyaltyCompanyId;


    //Constructors
    public LoyaltyCompany(){}

    public LoyaltyCompany(String companyName, int loyaltyCompanyId){
        this.setCompanyName(companyName);
        this.setLoyaltyCompanyId(loyaltyCompanyId);
    }

    public LoyaltyCompany(int loyaltyCompanyId){
        this.setLoyaltyCompanyId(loyaltyCompanyId);
    }

    //Getters and Setter
    //Company Name
    public void setCompanyName(String companyName){
        this.CompanyName = companyName;
    }
    public String getCompanyName(){
        return this.CompanyName;
    }

    //Loyalty Company Id
    public void setLoyaltyCompanyId(int loyaltyCompanyId){
        this.LoyaltyCompanyId = loyaltyCompanyId;
    }
    public int getLoyaltyCompanyId(){
        return this.LoyaltyCompanyId;
    }

    //Custom Methods
    public static boolean isEmpty(String n){
        return n == null || n.length() == 0;
    }

    public String getMemberName (){
        if(isEmpty(this.CompanyName)){
            return "No Company Name to Find.";
        } else {
            return this.CompanyName;
        }
    }
}
