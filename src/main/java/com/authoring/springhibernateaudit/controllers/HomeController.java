package com.authoring.springhibernateaudit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authoring.springhibernateaudit.entities.Course;
import com.authoring.springhibernateaudit.entities.ProjectProduct;
import com.authoring.springhibernateaudit.repositories.ICourseFilterRepository;
import com.authoring.springhibernateaudit.repositories.ICourseRepository;
import com.authoring.springhibernateaudit.repositories.IProjectProductRepository;
import com.authoring.springhibernateaudit.repositories.IReviewRepository;
import com.authoring.springhibernateaudit.specification.CourseSpecification;

@RestController
public class HomeController {

	@Autowired
	IProjectProductRepository projectProductRepository;

	@Autowired
	ICourseRepository courseRepository;

	@Autowired
	IReviewRepository reviewRepository;
	
	@Autowired
	ICourseFilterRepository courseFilterRepository;

	@PostMapping("/addprojectproduct")
	public ProjectProduct saveProjectProduct(@RequestBody ProjectProduct projectProduct) {
		return projectProductRepository.save(projectProduct);
	}

	@PostMapping("/addcourse")
	public Course saveCourse(@RequestBody Course course) {
		Course savedCourse = courseRepository.save(course);
		course.getReviews().forEach((review) -> {
			review.setCourse(savedCourse);
			reviewRepository.save(review);
		});
		return course;
	}
	
	@PostMapping("/search")
	public List<Course> getCourse(){
		return courseFilterRepository.findAll(new CourseSpecification());
	}
}