package com.example.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;

@SpringBootApplication
@RestController
public class MongodbApplication {


    @RequestMapping("/api/")
    public String home() {
        System.out.println("Testing this ....");
        return "Spring boot is working!";
    }
    
    @Autowired
    MongoTemplate mongoTemplate;
    
   /*@Bean
	public MongoTemplate mongoTemplate() throws Exception {

		this.mongoTemplate =
			new MongoTemplate(new MongoClient("127.0.0.1"),"claims");
		return mongoTemplate;

	}*/
    
  /*  @Bean
    public Mongobee mongobee() {
        Mongobee runner = new Mongobee("mongodb://localhost:27017/legostore");
        runner.setMongoTemplate(mongoTemplate);
        //runner.setChangeLogsScanPackage("rc.legostore.persistence");

        return runner;
    }*/
    
    public static void main(String[] args) {
    	System.out.println("Mongo database args:: " + args);
    	System.out.print(args.toString());
        SpringApplication.run(MongodbApplication.class, args);

    }

}
