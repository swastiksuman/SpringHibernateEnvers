package com.authoring.springhibernateaudit.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.authoring.springhibernateaudit.entities.FilterVO;

@Aspect
@Configuration
public class ControllerAspects {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// What kind of method calls I would intercept
	// execution(* PACKAGE.*.*(..))
	// Weaving & Weaver
	@After("execution(* com.authoring.springhibernateaudit.controllers.*.*getCourse*(..))")
	public void before(JoinPoint joinPoint) {
		// Advice
		System.out.println("Hua Execute");
		Object[] args = joinPoint.getArgs();
		System.out.println(((FilterVO) args[0]).toString());;
		logger.info(" Check for user access ");
		logger.info(" Allowed execution for {}", joinPoint);
	}

}
