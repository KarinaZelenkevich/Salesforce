package models;


import com.github.javafaker.Faker;

public class AccountFactory {
    static Faker faker = new Faker();

    public static Account getAccount() {
        return Account.builder()
                .accountName(faker.funnyName().name())
                .webSite(faker.company().logo())
                .phone(faker.phoneNumber().phoneNumber())
                .type("Investor")
                .industry("Apparel")
                .employees(faker.number().digits(1))
                .description(faker.princessBride().character())
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .parentAccount("Lou Dan Obseen")
                .billingCity(faker.address().cityName())
                .shippingCity(faker.address().cityName())
                .billingZipCode(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingZipCode(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .build();
    }

}
