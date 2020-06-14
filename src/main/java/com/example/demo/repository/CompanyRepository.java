package com.example.demo.repository;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    @Query("select max(c.id) from Company c")
    Long getCompanyId();
}
