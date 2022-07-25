package com.sourprojects.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sourprojects.workshopmongo.domain.Post;



@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
