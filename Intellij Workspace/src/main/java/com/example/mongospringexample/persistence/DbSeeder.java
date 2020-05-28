package com.example.mongospringexample.persistence;

import com.example.mongospringexample.model.Address;
import com.example.mongospringexample.model.Customer;
import com.example.mongospringexample.model.Purchase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@Service
@RestController
@RequestMapping("/DbSeeder")
public class DbSeeder implements CommandLineRunner {

    private MongoTemplate template;

    public DbSeeder(MongoTemplate template) {
        this.template = template;
    }

    @RequestMapping("/insert")
    public void insertData(){
        template.insert(new Customer("Dub", "smash", new Address("No Where", "9999"), Arrays.asList(new Purchase("101",
                "Item Desc", 25.5), new Purchase("102",
                "Item Desc", 25.5))));
        System.out.println("***** From insertData method ********");
    }



    @Override
    public void run(String... args) throws Exception {
        /* Code to perform batch insert using MongoTemplate */

        Customer customer1 = new Customer("batchInsert1", "smash", new Address("No Where", "9999"), Arrays.asList(new Purchase("101",
                "Item Desc", 25.5), new Purchase("102",
                "Item Desc", 25.5)));

        Customer customer2 = new Customer("batchInsert2", "smash", new Address("No Where", "9999"), Arrays.asList(new Purchase("101",
                "Item Desc", 25.5), new Purchase("102",
                "Item Desc", 25.5)));

        Collection<Customer> customers = Arrays.asList(customer1,customer2);

        this.template.insertAll(customers);

        System.out.println("***** From RUN method ********");


    }
}
