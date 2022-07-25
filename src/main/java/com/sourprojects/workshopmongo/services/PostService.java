package com.sourprojects.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourprojects.workshopmongo.domain.Post;

import com.sourprojects.workshopmongo.repository.PostRepository;
import com.sourprojects.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
//	public Post findById(String id) { 
//		  Optional<Post> obj = repo.findById(id);
//		  if(obj == null) {
//			throw new ObjectNotFoundException("Objeto não encotrado");  
//		  }
//		  return obj;
//	}
	
	public Post findById(String id) { 
		  Optional<Post> obj = repo.findById(id); 
		  return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
	}
	
	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}
				  
				  

}
