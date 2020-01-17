package com.astontech.bo;

public class Email extends Employee{

    //Parameters
    private int EmailId;
    private String EmailAddress;

    //Constructors
    public Email(){}

    public Email(int emailId, String emailAddress){
        this.setEmailId(emailId);
        this.setEmailAddress(emailAddress);
    }

    public Email(String emailAddress){
        this.setEmailAddress(emailAddress);
    }


    //Getters and Setters
    //Email ID
    public void setEmailId(int emailId){
        this.EmailId = emailId;
    }
    public int getEmailId(){
        return this.EmailId;
    }

    //Email Address
    public void setEmailAddress(String emailAddress) {
        this.EmailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.EmailAddress;
    }

    //Custom Methods
    public static boolean isEmpty(String e){
        return e == null || e.length() == 0;
    }

    public String getEAddress(){
        if (isEmpty(this.EmailAddress)) {
            return "No Email address to find";
        } else {
            return this.EmailAddress;
        }
    }
}
