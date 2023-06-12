package com.github.cleytonorocha.webservice_jpa_springBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.cleytonorocha.webservice_jpa_springBoot.entities.User;
import com.github.cleytonorocha.webservice_jpa_springBoot.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        return repository.findById(id).get();
    }

}
