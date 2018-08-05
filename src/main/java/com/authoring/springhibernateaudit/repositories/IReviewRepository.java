package com.authoring.springhibernateaudit.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.authoring.springhibernateaudit.entities.Review;

public interface IReviewRepository extends CrudRepository<Review, Serializable>{

}
