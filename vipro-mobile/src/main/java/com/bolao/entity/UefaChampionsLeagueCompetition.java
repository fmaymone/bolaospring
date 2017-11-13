package com.bolao.entity;

import javax.persistence.Entity;

@Entity
public class UefaChampionsLeagueCompetition extends Competition {
	
	protected UefaChampionsLeagueCompetition() {}
	
	public UefaChampionsLeagueCompetition(String name, String finalPlace) {
		super(name);
		this.finalPlace = finalPlace;
		
	}
	
	private String finalPlace;

}
