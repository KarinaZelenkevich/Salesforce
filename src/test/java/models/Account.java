package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Account {
    private final String industry;
    String accountName;
    String webSite;
    String type;
    String phone;
    String parentAccount;
    String employees;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingCity;
    String billingState;
    String shippingCity;
    String shippingState;
    String billingZipCode;
    String billingCountry;
    String shippingZipCode;
    String shippingCountry;

}