package com.example.demo.repository;

import com.example.demo.model.Purchase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

    @Query("select max(p.id) from Purchase p")
    Long getPurchaseId();

    @Query("select p from Purchase p where p.purchaseFrom = :company")
    List<Purchase> getPurchaseBasedOnCompany(String company);

    @Query("select p from Purchase p where p.id = :id")
    List<Purchase> getPurchaseBasedOnPurchaseId(Long id);

    @Query("select p from Purchase p where p.date = :date")
    List<Purchase> getPurchaseBasedOnDate(LocalDate date);

}
