package com.example.demo.repository;

import com.example.demo.model.Purchase;
import com.example.demo.model.Sale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface SaleRepository extends CrudRepository<Sale, Long> {
    @Query("select max(s.id) from Sale s")
    Long getSaleId();

    @Query("select s from Sale s where s.soldto = :company")
    List<Sale> getsaleBasedOnCompany(String company);

    @Query("select s from Sale s where s.id = :id")
    List<Sale> getsaleBasedOnsaleId(Long id);

    @Query("select s from Sale s where s.date = :date")
    List<Sale> getsaleBasedOnDate(LocalDate date);



}
