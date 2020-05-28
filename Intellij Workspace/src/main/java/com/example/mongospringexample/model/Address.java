package com.example.mongospringexample.model;

public class Address {

    private String streetName;
    private String zipcode;

    public Address(String streetName, String zipcode) {
        this.streetName = streetName;
        this.zipcode = zipcode;
    }

    public Address() {
        System.out.println("Does nothing - Address Constructor");
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
