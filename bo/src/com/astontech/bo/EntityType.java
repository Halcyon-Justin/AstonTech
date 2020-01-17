package com.astontech.bo;

public class EntityType extends Entity{

    //Parameters
    private int EntityTypeId;
    private String EntityTypeName;
    private int EntityId;


    //Constructors
    public EntityType(){}

    public EntityType(int entityTypeId, String entityTypeName, int entityId){
        this.setEntityTypeId(entityTypeId);
        this.setEntityTypeName(entityTypeName);
        this.setEntityId(entityId);
    }

    public EntityType(String entityTypeName){
        this.setEntityTypeName(entityTypeName);
    }


    //Getters and Setters
    //Entity Type Id
    public void setEntityTypeId(int entityTypeId){
        this.EntityId = entityTypeId;
    }
    public int getEntityTypeId(){
        return this.EntityTypeId;
    }

    //Entity Type Name
    public void setEntityTypeName(String entityTypeName){
        this.EntityTypeName = entityTypeName;
    }
    public String getEntityTypeName(){
        return this.EntityTypeName;
    }

    //Entity ID
    public void setEntityId(int entityId){
        this.EntityId = entityId;
    }
    public int getEntityId(){
        return this.EntityId;
    }
}
