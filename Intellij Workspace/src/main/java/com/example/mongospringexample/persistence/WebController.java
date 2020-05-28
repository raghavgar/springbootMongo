package com.example.mongospringexample.persistence;

import com.example.mongospringexample.model.Address;
import com.example.mongospringexample.model.Customer;
import com.example.mongospringexample.model.Purchase;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collection;

@Service
@RestController
@RequestMapping("/webInsert")
public class WebController {

    private MongoTemplate template;

    public WebController(MongoTemplate template) {
        this.template = template;
    }

    /*
    curl -X POST \
>   http://localhost:8080/webInsert\
>   -H 'cache-control: no-cache' \
>   -H 'content-type: application/json' \
>   -d '{
>   "id": "web1",
>   "firstName": "Lays",
>   "lastName": "Uncle",
>   "address": {
>     "streetName": "No Where",
>     "zipcode": "9999"
>   },
>   "purchases": [
>     {
>       "itemId": "104",
>       "itemDesc": "Item Desc",
>       "price": 23.5
>     },
>     {
>       "itemId": "105",
>       "itemDesc": "Item Desc",
>       "price": 25.58
>     }
>   ]
>
> }'
     */
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String insertDataFromRequest(@RequestBody Customer customer){
        System.out.println(customer);
        template.insert(customer);
        return "Inserted";
    }

    /*
        http://localhost:8080/webInsert/all   - Result can be viewed from browser
     */
    @GetMapping("/all")
    public Collection<Customer> getAllCustomers(){
        System.out.println(CurrentDateTimeProvider.class + "******" + this.template.findAll(Customer.class));

        return this.template.findAll(Customer.class);
    }

    /*
    curl -X PUT \
  http://localhost:8080/webInsert/update \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -d '{
  "id": "web1",
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
        template.save(customer);
        System.out.println("Customer is updated" +customer.lastName);
        return "Update Success";
    }

    /*
        curl -X DELETE http://localhost:8080/webInsert/delete/web1
    */
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable  String id){
        this.template.remove(new Query(Criteria.where("id").is(id)), Customer.class);
        System.out.println("Deleted Customer with "+id);
    }

}
