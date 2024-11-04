package com.enrico.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.enrico.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	

}
