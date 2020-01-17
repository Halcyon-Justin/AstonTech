package com.astontech.bo;

import java.util.Date;

public class Client extends Address{

    //Parameters
    private String ClientName;
    private Date CreateDate;

    //Constructors
    public Client(){}

    public Client(String clientName, Date createDate){
        this.setClientName(clientName);
        this.setCreateDate(createDate);
    }

    public Client(String clientName){
        this.setClientName(clientName);
    }

    public Client(Date createDate){
        this.setCreateDate(createDate);
    }

    //Getters and Setters
    //Client Name
    public void setClientName(String clientName){
        this.ClientName = clientName;
    }
    public String getClientName(){
        return this.ClientName;
    }

    public void setCreateDate(Date createDate){
        this.CreateDate = createDate;
    }
    public Date getCreateDate(){
        return this.CreateDate;
    }

    //Custom Methods
    public static boolean isEmpty(String c){
        return c == null || c.length() == 0;
    }

    public String clientNameRecord(){
        if (isEmpty(this.ClientName)){
            return "No Client Names";
        } else {
            return this.ClientName;
        }
    }
}
