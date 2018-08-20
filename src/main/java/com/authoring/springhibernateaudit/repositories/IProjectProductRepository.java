package com.authoring.springhibernateaudit.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.authoring.springhibernateaudit.entities.ProjectProduct;

public interface IProjectProductRepository extends CrudRepository<ProjectProduct, Serializable> {
	
	@Query("Select case when c.cosId=p.product_id then true else false end as somedata from ProjectProduct p inner join Cos c on c.cosId=p.product_id")
	public List<Boolean> getProductsInCos();
	
}
