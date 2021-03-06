package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository repo;

    public List<User> getUser()
    {
        return (List<User>) repo.findAll();
    }

    public void save(User user)
    {
        repo.save(user);
    }
}
