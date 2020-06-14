package com.example.demo.repository;


import com.example.demo.model.Vendor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository  extends CrudRepository<Vendor, Long> {
    @Query("select max(v.id) from Vendor v")
    Long getVendorId();

}
