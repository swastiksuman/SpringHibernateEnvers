package com.authoring.springhibernateaudit.entities;

import java.io.Serializable;

public class ProjectProudctId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1795277875018862393L;
	private Long project_id;
	private Long product_id;

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

}
