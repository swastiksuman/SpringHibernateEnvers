package com.authoring.springhibernateaudit.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.authoring.springhibernateaudit.entities.Difficulty;
import com.authoring.springhibernateaudit.entities.FilterVO;

public class CourseSpecification implements Specification {
	
	private FilterVO filterVO;
	
	
	
	public CourseSpecification(FilterVO filter) {
		super();
		this.filterVO = filter;
	}



	@Override
	public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
		List<Predicate> predicates = new ArrayList<Predicate>();
		predicates.add(criteriaBuilder.like(root.get("name"), "%" + "swastik" + "%"));
		//predicates.add(criteriaBuilder.like(root.get("name"), "%" + "hibernate" + "%"));
		predicates.add(criteriaBuilder.equal(root.get("difficulty"), filterVO.getDifficulty()));
		predicates.add(criteriaBuilder.between(root.get("createdDate"), filterVO.getCreatedDateFrom(), filterVO.getCreatedDateTo()));
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

}
