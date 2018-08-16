package com.authoring.springhibernateaudit.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.authoring.springhibernateaudit.models.ProjectProductVO;

@Repository
public class CosDAO {
	@Autowired
	EntityManager em;

	public List<ProjectProductVO> getIdsInConflict() {
		List<ProjectProductVO> projectProductVOList = new ArrayList<>();
		List<Object[]> listOfIdsInConflict = em
				.createNativeQuery(
						"select p.product_id , p.version, c.version AS version2 from ProjectProducts p inner join cos c on p.product_id = c.cos_id where p.version = c.version")
				.getResultList();
		System.out.println(listOfIdsInConflict.size());
		listOfIdsInConflict.stream().forEach((data) -> {
			projectProductVOList
					.add(new ProjectProductVO(((BigInteger) data[0]).longValue(), (double) data[1], (double) data[2]));
		});
		return projectProductVOList;
	}

}
