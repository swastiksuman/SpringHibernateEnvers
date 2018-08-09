package com.authoring.springhibernateaudit.entities;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Course.class)
public class Course_ {
	    public static volatile SingularAttribute<Course, Long> id;
	    public static volatile SingularAttribute<Course, String> name;
	    public static volatile SingularAttribute<Course, Difficulty> difficulty;
	    public static volatile SingularAttribute<Course, Date> createdDate;
	    
}
