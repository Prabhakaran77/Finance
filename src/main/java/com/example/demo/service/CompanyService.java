package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.model.Purchase;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    public CompanyRepository repo;
    public List<Company> getCompany()
    {
        return (List<Company>) repo.findAll();
    }
    public Long nextCompanyId()
    {
        if(getCompany().size()<1)
            return 1L;
        else
            return repo.getCompanyId()+1;
    }
    public void save(Company company)
    {
        repo.save(company);
    }
}
