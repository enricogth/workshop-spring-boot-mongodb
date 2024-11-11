package com.enrico.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enrico.workshopmongo.domain.Post;
import com.enrico.workshopmongo.repository.PostRepository;
import com.enrico.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
}