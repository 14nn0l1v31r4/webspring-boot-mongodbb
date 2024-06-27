package com.iannmolendolff.mondodb_springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iannmolendolff.mondodb_springboot.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	

}