package com.ouss.task1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ouss.task1.model.User;
import com.ouss.task1.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository _repository;
	
	public Optional<User> registerUser(User _userResponse) {
		
		return Optional.of(_repository.save(_userResponse));
	}

}
