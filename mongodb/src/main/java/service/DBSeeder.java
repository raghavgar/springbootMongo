package service;

import model.Claim;
import model.ClaimLines;
import model.ProviderInfo;
import model.TestDocument;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBSeeder implements CommandLineRunner {
    //private LegoSetRepository legoSetRepository;
    private MongoTemplate mongoTemplate;

    public DBSeeder(MongoTemplate mongoTemplate) {
        //this.legoSetRepository = legoSetRepository;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) {

        System.out.println("started Insertion");

        Claim claim1 = new Claim("C001", Arrays.asList(new ClaimLines(1, "First Line"),
                new ClaimLines(2, "Second Line")), new ProviderInfo("provider1", "NPI1"));

        Claim claim2 = new Claim("C001", Arrays.asList(new ClaimLines(1, "First Line"),
                new ClaimLines(2, "Second Line")), new ProviderInfo("provider1", "NPI1"));

        Claim claim3 = new Claim("C001", Arrays.asList(new ClaimLines(1, "First Line"),
                new ClaimLines(2, "Second Line")), new ProviderInfo("provider1", "NPI1"));

        System.out.println("Before Insertion");

        TestDocument test = new TestDocument(10);
        this.mongoTemplate.insert(test);

        System.out.println(this.mongoTemplate.insert(claim1));
        this.mongoTemplate.insert(claim2);
        this.mongoTemplate.insert(claim3);

    }
}
