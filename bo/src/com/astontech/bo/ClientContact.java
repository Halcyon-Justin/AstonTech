package com.astontech.bo;

public class ClientContact extends Client {

    //Parameters
    private int ClientContactId;
    private int EntityTypeId;

    //Constructors
    public ClientContact(){}

    public ClientContact(int clientContactId, int entityTypeId){
        this.setClientContactId(clientContactId);
        this.setEntityTypeId(entityTypeId);
    }
    //Getters and Setters
    //Client Contact ID
    public void setClientContactId(int clientContactId){
        this.ClientContactId = clientContactId;
    }
    public int getClientContactId(){
        return this.ClientContactId;
    }

    //EntityTypeId
    public void setEntityTypeId(int entityTypeId){
        this.EntityTypeId = entityTypeId;
    }
    public int getEntityTypeId(){
        return this.EntityTypeId;
    }

    //Custom Methods

}
