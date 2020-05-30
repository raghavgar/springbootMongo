package com.example.springjpa.exampleonjpa.model;

import javax.persistence.*;
import java.util.List;

//https://stackoverflow.com/questions/25283198/spring-boot-jpa-column-name-annotation-ignored
@Entity
public class Customer {
    @Id
    @Column(name="customerId")
    private  String customerId;
    @Column(name="name")
    private String name;
    @Column(name="purchaseId")
    private  String purchaseId;

    @OneToMany(fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
    private List<Purchase> purchases;

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Customer(String customerId, String name, String purchaseId, List<Purchase> purchases) {
        this.customerId = customerId;
        this.name = name;
        this.purchaseId = purchaseId;
        this.purchases = purchases;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", purchaseId='" + purchaseId + '\'' +
                ", purchases=" + purchases +
                '}';
    }
}
