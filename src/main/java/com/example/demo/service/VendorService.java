package com.example.demo.service;

import com.example.demo.model.Partner;
import com.example.demo.model.Vendor;
import com.example.demo.repository.PartnerRepository;
import com.example.demo.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorService {

    @Autowired
    public VendorRepository repo;
    public List<Vendor> getVendor()
    {
        return (List<Vendor>) repo.findAll();
    }
    public Long nextVendorId()
    {
        if(getVendor().size()<1)
            return 1L;
        else
            return repo.getVendorId()+1;
    }
    public void save(Vendor vendor)
    {
        repo.save(vendor);
    }
}
