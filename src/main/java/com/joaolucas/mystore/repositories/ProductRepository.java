package com.joaolucas.mystore.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.mystore.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
