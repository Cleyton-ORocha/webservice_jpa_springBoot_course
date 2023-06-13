package com.github.cleytonorocha.webservice_jpa_springBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.cleytonorocha.webservice_jpa_springBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
