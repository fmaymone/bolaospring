package com.bolao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Bet {
	
	public Bet(User user, Match match, int scoreHome, int scoreAway) {
		super();
		this.user = user;
		this.match = match;
		this.scoreHome = scoreHome;
		this.scoreAway = scoreAway;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private User user;
	
	@OneToOne
	private Match match;
	
	@Column
	private int scoreHome;
	
	@Column
	private int scoreAway;
	
	@OneToOne
	private Team away;
	
	@OneToOne
	private Team home;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public int getscoreHome() {
		return scoreHome;
	}

	public void setscoreHome(int scoreHome) {
		this.scoreHome = scoreHome;
	}

	public int getscoreAway() {
		return scoreAway;
	}

	public void setscoreAway(int scoreAway) {
		this.scoreAway = scoreAway;
	}

	public Team getAway() {
		return away;
	}

	public void setAway(Team away) {
		this.away = away;
	}

	public Team getHome() {
		return home;
	}

	public void setHome(Team home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "Bet [id=" + id + ", user=" + user + ", match=" + match + ", scoreHome=" + scoreHome + ", scoreAway=" + scoreAway
				+ ", away=" + away + ", home=" + home + "]";
	}
	
	
	public int calculatePointsBet() {
		
		int points = calculatePointsMatch();
		
		if(this.match.isKnockout()) {
			
			points += calculatePointsKnockOut();
		}
		
		
		return points;
		
	}
	
	public int calculatePointsMatch() {
		
		return 1;
	}
	
	public int calculatePointsKnockOut() {
		
		
		return 8;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
