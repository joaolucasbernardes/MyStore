package com.joaolucas.mystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.mystore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
