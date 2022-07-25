package com.sourprojects.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourprojects.workshopmongo.domain.User;
import com.sourprojects.workshopmongo.repository.UserRepository;
import com.sourprojects.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) { 
		  Optional<User> obj = repo.findById(id); 
		  return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado")); 
		} 

}
