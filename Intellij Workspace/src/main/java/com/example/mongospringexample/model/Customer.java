package com.example.mongospringexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Document
public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;
    public Address address;
    public Collection<Purchase> purchases = new ArrayList<>();



    public Customer() {}

    public Customer(String firstName, String lastName, Address address, Collection<Purchase> purchases) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.purchases = purchases;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Collection<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Collection<Purchase> purchases) {
        this.purchases = purchases;
    }
}
