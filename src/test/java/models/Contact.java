package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Contact {

    String phone;
    String mobile;
    String salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String email;
    String mailingStreet;
    String mailingAddress;
    String mailingCity;
    String mailingState;
    String mailingZip;
    String mailingCountry;
}

