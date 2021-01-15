package com.nabendu;

public class Coach extends People{
    public int experience;
    private String accreditationLever;
    public Coach(String name,int experience,String accreditationLever, String address) {
        super(name, address);
        this.experience = experience;
        this.accreditationLever = accreditationLever;
    }

    public String getAccreditationLever() {
        return accreditationLever;
    }

    public void setAccreditationLever(String accreditationLever) {
        this.accreditationLever = accreditationLever;
    }
}
