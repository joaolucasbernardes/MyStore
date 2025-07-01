package com.joaolucas.mystore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.mystore.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
