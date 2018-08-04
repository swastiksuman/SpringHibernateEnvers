package com.authoring.springhibernateaudit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;


@Audited
@Entity
@IdClass(ProjectProudctId.class)
@Table(name = "projectproducts")
public class ProjectProduct implements Serializable {

	private static final long serialVersionUID = 5227983835373099751L;
	
	@Id
	@Column(name = "project_id")
	private Long project_id;
		
	@Id
	@Column(name = "product_id")
	private Long product_id;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "newobject")
	private String newObject;
	
	@NotAudited
	@Column(name = "oldobject")
	private String oldObject;

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getNewObject() {
		return newObject;
	}

	public void setNewObject(String newObject) {
		this.newObject = newObject;
	}

	public String getOldObject() {
		return oldObject;
	}

	public void setOldObject(String oldObject) {
		this.oldObject = oldObject;
	}
}
