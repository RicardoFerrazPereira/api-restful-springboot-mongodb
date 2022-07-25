package com.sourprojects.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sourprojects.workshopmongo.domain.Post;



@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	
	// Consulta por Query
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	
	// Consulta simples com Métodos Query
	
	List<Post> findByTitleContainingIgnoreCase(String text);

}
