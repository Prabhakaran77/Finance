package com.example.demo.repository;


import com.example.demo.model.Partner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PartnerRepository extends CrudRepository<Partner, Long> {
    @Query("select max(p.id) from Partner p ")
    Long getPartnerId();

}
