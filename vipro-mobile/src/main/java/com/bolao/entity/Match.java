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
public class Match {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	private Round round;
	
	public Round getRound() {
		return round;
	}
	
	@Column
	private Date start_at;

	public Date getStart_at() {
		return start_at;
	}

	public void setStart_at(Date start_at) {
		this.start_at = start_at;
	}

	public void setRound(Round round) {
		this.round = round;
	}

	@Column
	private int num;
	
	@Column
	private boolean knockout;
	
	@Column
	private int scoreHome;
	
	@Column
	private int scoreAway;
	
	@Column
	private int scoreHomeet;
	
	@Column
	private int scoreAwayet;
	
	@Column
	private int scoreHomepenalties;
	
	@Column
	private int scoreAwaypenalties;
	
	@OneToOne
	private Team away;
	
	@OneToOne
	private Team home;
	
	@Override
	public String toString() {
		
		return "Match number " + this.num + " || between " + this.home.getName() + " and " + this.away.getName() + " ||";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isKnockout() {
		return knockout;
	}

	public void setKnockout(boolean knockout) {
		this.knockout = knockout;
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

	public int getscoreHomeet() {
		return scoreHomeet;
	}

	public void setscoreHomeet(int scoreHomeet) {
		this.scoreHomeet = scoreHomeet;
	}

	public int getscoreAwayet() {
		return scoreAwayet;
	}

	public void setscoreAwayet(int scoreAwayet) {
		this.scoreAwayet = scoreAwayet;
	}

	public int getscoreHomepenalties() {
		return scoreHomepenalties;
	}

	public void setscoreHomepenalties(int scoreHomepenalties) {
		this.scoreHomepenalties = scoreHomepenalties;
	}

	public int getscoreAwaypenalties() {
		return scoreAwaypenalties;
	}

	public void setscoreAwaypenalties(int scoreAwaypenalties) {
		this.scoreAwaypenalties = scoreAwaypenalties;
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
	
	
	
	
	
	
	
	
	



}
