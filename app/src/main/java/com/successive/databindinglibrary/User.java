package com.successive.databindinglibrary;

public class User {
    private String userName;
    private String phoneNumber;
    private String company;
    private String designation;

    public User(String userName, String phoneNumber, String company, String designation) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.designation = designation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
