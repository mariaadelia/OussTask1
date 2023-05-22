package com.ouss.task1.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ouss.task1.model.User;
import com.ouss.task1.repository.UserRepository;
import com.ouss.task1.service.UserService;


@RestController
@RequestMapping("/api/form")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	@Autowired
	private UserRepository _repository;
	
	@Autowired
	private UserService _service;
	
	
	@GetMapping("/show")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(_repository.findAll());
	}
	
	
	@PostMapping("/post")
	public ResponseEntity <Optional<User>> register(@RequestBody User _user){
		return ResponseEntity.status(HttpStatus.CREATED).body(_service.registerUser(_user));
	}
	
	
	
}
