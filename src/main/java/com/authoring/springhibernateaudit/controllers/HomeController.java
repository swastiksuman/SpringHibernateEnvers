package com.authoring.springhibernateaudit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authoring.springhibernateaudit.entities.ProjectProduct;
import com.authoring.springhibernateaudit.repositories.IProjectProductRepository;

@RestController
public class HomeController {
	
	@Autowired
	IProjectProductRepository projectProductRepository;
	
	@PostMapping("/addprojectproduct")
	public ProjectProduct saveProjectProduct(@RequestBody ProjectProduct projectProduct){
		return projectProductRepository.save(projectProduct);
	}
}
