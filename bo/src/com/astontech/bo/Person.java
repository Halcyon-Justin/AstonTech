package com.astontech.bo;

public class Person extends BaseBO{

    //Values for the Object
    //PersonId
    private int PersonId;

    //Title
    private String Title;

    //First Name
    private String FirstName;

    //Last Name
    private String LastName;

    //DisplayFirstName
    private String DisplayFirstName;

    //Gender
    private String Gender;


    //Constructors

    public Person(){}

    public Person(int personId, String title, String gender){
        this.setPersonId(personId);
        this.setTitle(title);
        this.setGender(gender);
    }

    public Person(String firstName,int personId){
        this.setFirstName(firstName);
        this.setPersonId(personId);
    }


    //Getters and Setters
    //Person ID
    public void setPersonId(int personId){
        this.PersonId = personId;
    }

    public int getPersonId(){
        return this.PersonId;
    }

    //Title
    public void setTitle(String title){
        this.Title = title;
    }

    public String getTitle(){
        return this.Title;
    }

    //First Name
    public void setFirstName(String firstName){
        this.FirstName = firstName;
    }

    public String getFirstName(){
        return this.FirstName;
    }

    //Last Name
    public void setLastName(String lastName){
        this.LastName = lastName;
    }

    public String getLastName(){
        return this.LastName;
    }

    //Display First Name
    public void setDisplayFirstName(String displayFirstName){
        this.DisplayFirstName = displayFirstName;
    }

    public String getDisplayFirstName(){
        return this.DisplayFirstName;
    }

    //Gender
    public void setGender(String gender){
        this.Gender = gender;
    }

    public String getGender(){
        return this.Gender;
    }


    //CUSTOM METHODS
    //notes:    this will become an extension method

    public static boolean isNullOrEmpty(String s){
        return s == null || s.length() == 0;
    }

    public String getFullName() {
        if(isNullOrEmpty(this.FirstName) && isNullOrEmpty(this.LastName)){
            return "No name set";
        } else {
            if(isNullOrEmpty(this.FirstName)){
                return this.LastName;
            } else if (isNullOrEmpty(this.LastName)){
                return this.FirstName;
            } else {
                return this.FirstName + " " + this.LastName;
            }
        }
    }
}
