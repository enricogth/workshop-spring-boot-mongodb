package com.enrico.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.enrico.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	

}
