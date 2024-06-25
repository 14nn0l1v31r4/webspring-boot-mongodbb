package com.iannmolendolff.mondodb_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iannmolendolff.mondodb_springboot.domain.User;
import com.iannmolendolff.mondodb_springboot.repository.UserRepository;

@Service
public class UserService {
	
	// instanciar auto, mecanismo de injeção de dependecia automatica do spring
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
