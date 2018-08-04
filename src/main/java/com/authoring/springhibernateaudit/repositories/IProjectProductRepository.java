package com.authoring.springhibernateaudit.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.authoring.springhibernateaudit.entities.ProjectProduct;

public interface IProjectProductRepository extends CrudRepository<ProjectProduct, Serializable> {

}
