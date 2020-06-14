package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.model.Partner;
import com.example.demo.repository.CompanyRepository;
import com.example.demo.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartnerService {

    @Autowired
    public PartnerRepository repo;
    public List<Partner> getPartner()
    {
        return (List<Partner>) repo.findAll();
    }
    public Long nextPartnerId()
    {
        if(getPartner().size()<1)
            return 1L;
        else
            return repo.getPartnerId()+1;
    }
    public void save(Partner partner)
    {
        repo.save(partner);
    }
}
