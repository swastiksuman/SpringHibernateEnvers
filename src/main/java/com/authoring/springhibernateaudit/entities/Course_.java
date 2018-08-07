package com.authoring.springhibernateaudit.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Course.class)
public class Course_ {
	    public static volatile SingularAttribute<Course, Long> id;
	    public static volatile SingularAttribute<Course, String> name;
}
