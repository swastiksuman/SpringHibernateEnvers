package com.authoring.springhibernateaudit.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.authoring.springhibernateaudit.entities.Course;

public interface ICourseRepository extends CrudRepository<Course, Serializable>{
	
	
}
