package com.authoring.springhibernateaudit.entities;

public enum Difficulty {
	
	HARD("H"), MEDIUM("M"), EASY("E");
	
	private String difficulty;
	
	Difficulty(String difficulty){
		this.difficulty = difficulty;
	}

	public String getDifficulty() {
		return difficulty;
	}
}
