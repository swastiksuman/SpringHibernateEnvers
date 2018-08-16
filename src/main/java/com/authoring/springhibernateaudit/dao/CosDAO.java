package com.authoring.springhibernateaudit.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CosDAO {
	@Autowired
	EntityManager em;

	public void getIdsInConflict() {
		List<Object[]> listOfIdsInConflict = em
				.createNativeQuery(
						"select p.product_id from ProjectProducts p inner join cos c on p.product_id = c.cos_id where p.version = c.version")
				.getResultList();
		System.out.println(listOfIdsInConflict.size());
	}

}
