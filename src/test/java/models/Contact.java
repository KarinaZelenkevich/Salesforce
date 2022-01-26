package models;

import org.openqa.selenium.By;

public class Contact {

    String phone;
    String mobile;
    String salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String email;
    String ReportsTo;
    String maillingStreet;
    String otherStreet;
    String maillingCity;
    String maillingState;
    String otherCity;
    String otherState;
    String maillingZip;
    String maillingCountry;
    String otherZip;
    String otherCountry;
    String leadSource;
    String birthdate;

    public Contact(String phone, String mobile, String salutation, String firstName, String lastName, String accountName,
                   String title, String email, String reportsTo, String maillingStreet, String otherStreet, String maillingCity,
                   String maillingState, String otherCity, String otherState, String maillingZip, String maillingCountry,
                   String otherZip, String otherCountry, String leadSource, String birthdate) {
        this.phone = phone;
        this.mobile = mobile;
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.title = title;
        this.email = email;
        ReportsTo = reportsTo;
        this.maillingStreet = maillingStreet;
        this.otherStreet = otherStreet;
        this.maillingCity = maillingCity;
        this.maillingState = maillingState;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.maillingZip = maillingZip;
        this.maillingCountry = maillingCountry;
        this.otherZip = otherZip;
        this.otherCountry = otherCountry;
        this.leadSource = leadSource;
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReportsTo() {
        return ReportsTo;
    }

    public void setReportsTo(String reportsTo) {
        ReportsTo = reportsTo;
    }

    public String getMaillingStreet() {
        return maillingStreet;
    }

    public void setMaillingStreet(String maillingStreet) {
        this.maillingStreet = maillingStreet;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getMaillingCity() {
        return maillingCity;
    }

    public void setMaillingCity(String maillingCity) {
        this.maillingCity = maillingCity;
    }

    public String getMaillingState() {
        return maillingState;
    }

    public void setMaillingState(String maillingState) {
        this.maillingState = maillingState;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getMaillingZip() {
        return maillingZip;
    }

    public void setMaillingZip(String maillingZip) {
        this.maillingZip = maillingZip;
    }

    public String getMaillingCountry() {
        return maillingCountry;
    }

    public void setMaillingCountry(String maillingCountry) {
        this.maillingCountry = maillingCountry;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public void setOtherZip(String otherZip) {
        this.otherZip = otherZip;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
