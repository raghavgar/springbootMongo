package com.example.mongospringexample;

import com.example.mongospringexample.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MongospringexampleApplication {


    @RequestMapping("/hello")
    public String testRequestMapping(){
        return "<h1> Test Pass </h1>";
    }

    public static void main(String[] args) {
        System.out.println("This stage passed ************");
        SpringApplication.run(MongospringexampleApplication.class, args);
    }


}
