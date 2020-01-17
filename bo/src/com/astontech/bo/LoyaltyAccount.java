package com.astontech.bo;

public class LoyaltyAccount extends Employee {

    //Parameters
    private int LoyaltyAccount;
    private String MemberNumber;


    //Constructors
    public LoyaltyAccount(){}

    public LoyaltyAccount(int loyaltyAccount, String memberNumber){
        this.setLoyaltyAccount(loyaltyAccount);
        this.setMemberNumber(memberNumber);
    }

    public LoyaltyAccount(String memberNumber){
        this.setMemberNumber(memberNumber);
    }


    //Getters and Setters
    public void setLoyaltyAccount(int loyaltyAccount){
        this.LoyaltyAccount = loyaltyAccount;
    }
    public int getLoyaltyAccount(){
        return this.LoyaltyAccount;
    }

     //Member Number
     public void setMemberNumber(String memberNumber){
        this.MemberNumber = memberNumber;
     }
     public String getMemberNumber(){
        return this.MemberNumber;
     }

     //Custom Methods
     public static boolean noMemberRecord(String m){
         return m == null || m.length() == 0;
     }

    public String getMemberRecord(){
        if(noMemberRecord(this.MemberNumber)){
            return "there is not a record";
        } else {
            return this.MemberNumber;
        }
    }
}
