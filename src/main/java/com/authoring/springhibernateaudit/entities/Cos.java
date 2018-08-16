package com.authoring.springhibernateaudit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COS")
public class Cos {

	@Id
	@Column(name = "cos_id")
	private Long cosId;

	@Column(name = "version")
	private double version;

	public Long getCosId() {
		return cosId;
	}

	public void setCosId(Long cosId) {
		this.cosId = cosId;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
}
