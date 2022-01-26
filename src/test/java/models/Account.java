package models;

public class Account {
    private final String industry;
    String accountName;
    String webSite;
    String type;
    String fax;
    String phone;
    String parentAccount;
    String Employees;
    String annualRevenue;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZipeCode;
    String billingCountry;
    String shippingZipCode;
    String shippingCountry;



    public void setFax(String fax) {
        this.fax = fax;
    }

    public Account(String accountName, String webSite, String type, String fax, String phone,
                   String parentAccount, String employees, String industry, String annualRevenue, String description,
                   String billingStreet, String shipingStreet, String billingCity,
                   String billingState, String shippingCity,
                   String shippingState, String billingZipeCode, String billingCountry, String shippingZipCode, String shippingCountry) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.type = type;
        this.fax = fax;
        this.phone = phone;
        this.parentAccount = parentAccount;
        Employees = employees;
        this.industry = industry;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.billingZipeCode = billingZipeCode;
        this.billingCountry = billingCountry;
        this.shippingZipCode = shippingZipCode;
        this.shippingCountry = shippingCountry;
    }

    public String getFax() {
        return fax;
    }
    public String getPhone() {
       return phone;
    }

    public String getDescription() {
        return description;
    }

    public String getBillingZip() {
        return billingZipeCode;
    }

    public String getShippingZip() {
        return shippingZipCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getType() {
        return type;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public String getEmployees() {
        return Employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getIndustry() {
        return industry;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }
}

