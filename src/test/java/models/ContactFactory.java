package models;

import com.github.javafaker.Faker;

public class ContactFactory {

    static Faker faker = new Faker();

    public static Contact get() {
        return Contact.builder().salutation("Mr.")
                .accountName("Manny Kinn")
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .title(faker.princessBride().character())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .mailingAddress(faker.address().cityName())
                .mailingStreet(faker.address().streetAddress())
                .mailingCity(faker.address().cityName())
                .mailingState(faker.address().state())
                .mailingCountry(faker.address().country())
                .build();
    }
}