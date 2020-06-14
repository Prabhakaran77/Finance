package com.example.demo.service;

import com.example.demo.model.Purchase;
import com.example.demo.model.User;
import com.example.demo.repository.PurchaseRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class PurchaseService {

    @Autowired
    public PurchaseRepository repo;

    public List<Purchase> getPurchase()
    {
        return (List<Purchase>) repo.findAll();
    }

    public Long nextPurchaseId()
    {
        if(getPurchase().size()<1)
            return 1L;
        else
            return repo.getPurchaseId()+1;
    }

    public void save(Purchase purchase)
    {
        repo.save(purchase);
    }

    public List<Purchase> getPurchaseBasedOnOption(String option,String value)
    {
        if(option.equals("purchaseid"))
        {
           return repo.getPurchaseBasedOnPurchaseId(Long.parseLong(value));
        }
        else if(option.equals("company"))
        {
            return repo.getPurchaseBasedOnCompany(value);
        }
        else if(option.equals("date"))
        {
            LocalDate date = LocalDate.parse(value);
            return repo.getPurchaseBasedOnDate(date);
        }
        else
            return (List<Purchase>) repo.findAll();
    }
}
