package com.astontech.bo;

public class Entity extends Email {

    //Parameters
    private String EntityName;


    //Constructors
    public Entity() {
    }

    public Entity(String entityName) {
        this.setEntityName(entityName);
    }

    //Getters and Setters
    //Entity Name
    public void setEntityName(String entityName) {
        this.EntityName = entityName;
    }

    public String getEntityName() {
        return this.EntityName;
    }

}
