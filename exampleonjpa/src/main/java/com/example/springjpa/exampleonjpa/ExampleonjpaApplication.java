package com.example.springjpa.exampleonjpa;

import com.example.springjpa.exampleonjpa.model.Customer;
import com.example.springjpa.exampleonjpa.model.Purchase;
import com.example.springjpa.exampleonjpa.repository.CustomerRepository;
import com.example.springjpa.exampleonjpa.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ExampleonjpaApplication implements CommandLineRunner {
    @Autowired
    CustomerRepository repository;

    @Autowired
    PurchaseRepository purchaseRepository;


    public static void main(String[] args) {
        SpringApplication.run(ExampleonjpaApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        // Customer c = repository.findByCustomerId("Bill");
        // System.out.println(c);
         repository.findAll().forEach(System.out::println);
         purchaseRepository.findAll();

         Customer customer = new Customer("1001", "Name", "purchase1",
                 Arrays.asList(new Purchase("p001", "random text"),
                         new Purchase("p002", "random text") ));

         repository.save(customer);
         System.out.println("Customer saved ...");
        repository.findAll().forEach(System.out::println);


    }
}
