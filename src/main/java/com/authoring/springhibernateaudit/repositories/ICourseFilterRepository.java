package com.authoring.springhibernateaudit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.Repository;

import com.authoring.springhibernateaudit.entities.Course;

public interface ICourseFilterRepository extends Repository<Course, Serializable>, JpaSpecificationExecutor<Course>{

}
