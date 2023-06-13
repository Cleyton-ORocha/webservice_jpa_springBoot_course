package com.github.cleytonorocha.webservice_jpa_springBoot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.cleytonorocha.webservice_jpa_springBoot.entities.Order;
import com.github.cleytonorocha.webservice_jpa_springBoot.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;


    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        return repository.findById(id).get();
    }

}
