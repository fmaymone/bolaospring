package com.bolao.entity;

import javax.persistence.Entity;

@Entity
public class WorldCupCompetition extends Competition {
	
	protected WorldCupCompetition() {}
	
	public WorldCupCompetition(String name, String gunner) {
		super(name);
		this.gunner = gunner;
		
	}
	
	private String gunner;

}
