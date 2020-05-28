package com.example.mongospringexample.persistence;

import com.example.mongospringexample.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Service
@RestController
@RequestMapping("/repoWebInsert")
public class WebControllerUsingRepository {

    private MongoRepository repository;

    public WebControllerUsingRepository(MongoRepository<Customer, String> repository) {
        this.repository = repository;
    }

    /*

    */
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String insertDataFromRequest(@RequestBody Customer customer){
        System.out.println(customer);
        repository.insert(customer);
        return "Inserted";
    }

    /*
        http://localhost:8080/repoWebInsert/all   - Result can be viewed from browser
     */
    @GetMapping("/all")
    public Collection<Customer> getAllCustomers(){
       // System.out.println(CurrentDateTimeProvider.class + "******" + this.repository.findAll());

        return this.repository.findAll();
    }

    /*
    curl -X PUT \
  http://localhost:8080/repoWebInsert/update \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
  "id": "web2",
  "firstName": "Uncle Chips",
  "lastName": "Lays",
  "address": {
    "streetName": "No Where",
    "zipcode": "9999"
  },
  "purchases": [
    {
      "itemId": "104",
      "itemDesc": "Item Desc",
      "price": 23.5
    },
    {
      "itemId": "105",
      "itemDesc": "Item Desc",
      "price": 25.58
    }
  ]

}'
     */
    @PutMapping("/update")
    public String updateCustomerData(@RequestBody Customer customer){
        repository.save(customer);
        System.out.println("Customer is updated" +customer.lastName);
        return "Update Success";
    }

    /*
        curl -X DELETE http://localhost:8080/repoWebInsert/delete/web1
    */
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable  String id){
        this.repository.deleteById(id);
        System.out.println("Deleted Customer with "+id);
    }
}
