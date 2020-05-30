package com.example.springjpa.exampleonjpa.repository;

import com.example.springjpa.exampleonjpa.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    //List<Customer> findAll();
    Customer findByCustomerId(String id);
}
