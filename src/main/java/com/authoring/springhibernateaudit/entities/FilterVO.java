package com.authoring.springhibernateaudit.entities;

import java.util.Date;

public class FilterVO {
	private Date createdDateFrom;
	private Date createdDateTo;
	private Difficulty difficulty;

	public Date getCreatedDateFrom() {
		return createdDateFrom;
	}

	public void setCreatedDateFrom(Date createdDateFrom) {
		this.createdDateFrom = createdDateFrom;
	}

	public Date getCreatedDateTo() {
		return createdDateTo;
	}

	public void setCreatedDateTo(Date createdDateTo) {
		this.createdDateTo = createdDateTo;
	}
	
	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public String toString() {
		return "FilterVO [createdDateFrom=" + createdDateFrom + ", createdDateTo=" + createdDateTo + "]";
	}
}
