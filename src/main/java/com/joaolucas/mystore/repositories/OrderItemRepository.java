package com.joaolucas.mystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.mystore.entities.OrderItem;
import com.joaolucas.mystore.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
}
