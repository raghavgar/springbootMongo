package com.example.springjpa.exampleonjpa.repository;

import com.example.springjpa.exampleonjpa.model.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, String> {
}
