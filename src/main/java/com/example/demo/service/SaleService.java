package com.example.demo.service;

import com.example.demo.model.Purchase;
import com.example.demo.model.Sale;
import com.example.demo.repository.PurchaseRepository;
import com.example.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class SaleService {
    @Autowired
    public SaleRepository repo;

    public List<Sale> getSale()
    {
        return (List<Sale>) repo.findAll();
    }

    public Long nextSaleId()
    {
        if(getSale().size()<1)
            return 1L;
        else
            return repo.getSaleId()+1;
    }

    public void save(Sale sale)
    {
        repo.save(sale);
    }

    public List<Sale> getsaleBasedOnOption(String option,String value)
    {
        if(option.equals("saleid"))
        {
            return repo.getsaleBasedOnsaleId(Long.parseLong(value));
        }
        else if(option.equals("company"))
        {
            return repo.getsaleBasedOnCompany(value);
        }
        else if(option.equals("date"))
        {
            LocalDate date = LocalDate.parse(value);
            return repo.getsaleBasedOnDate(date);
        }
        else
            return (List<Sale>) repo.findAll();
    }
}


