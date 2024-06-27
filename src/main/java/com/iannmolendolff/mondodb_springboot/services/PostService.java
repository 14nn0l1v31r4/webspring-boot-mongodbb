package com.iannmolendolff.mondodb_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iannmolendolff.mondodb_springboot.domain.Post;
import com.iannmolendolff.mondodb_springboot.repository.PostRepository;
import com.iannmolendolff.mondodb_springboot.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	// instanciar auto, mecanismo de injeção de dependecia automatica do spring
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
				
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
