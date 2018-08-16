package com.authoring.springhibernateaudit.models;

public class ProjectProductVO {
	private Long productId;
	private double version;
	private double version2;

	public ProjectProductVO(Long productId, double version, double version2) {
		super();
		this.productId = productId;
		this.version = version;
		this.version2 = version2;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getVersion2() {
		return version2;
	}

	public void setVersion2(double version2) {
		this.version2 = version2;
	}

}
