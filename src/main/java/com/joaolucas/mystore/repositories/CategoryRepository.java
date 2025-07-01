package com.joaolucas.mystore.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.mystore.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
