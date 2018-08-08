package com.authoring.springhibernateaudit.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

public class CourseSpecification implements Specification {

	@Override
	public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
		List<Predicate> predicates = new ArrayList<Predicate>();
		predicates.add(criteriaBuilder.like(root.get("name"), "%" + "swastik" + "%"));
		predicates.add(criteriaBuilder.like(root.get("name"), "%" + "hibernate" + "%"));
		return criteriaBuilder.or(predicates.toArray(new Predicate[predicates.size()]));
	}

}
