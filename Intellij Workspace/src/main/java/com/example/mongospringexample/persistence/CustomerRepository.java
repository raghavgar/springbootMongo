package com.example.mongospringexample.persistence;

import com.example.mongospringexample.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
