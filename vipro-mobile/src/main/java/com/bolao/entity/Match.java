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
	private int scoreHomeET;
	
	@Column
	private int scoreAwayET;
	
	@Column
	private int scoreHomePenalties;
	
	@Column
	private int scoreAwayPenalties;
	
	@OneToOne
	private Team away;
	
	@OneToOne
	private Team home;
	
	@Override
	public String toString() {
		
		return "Match number " + this.num + " || between " + this.home.getName() + " and " + this.away.getName() + " ||";
	}

	
	
	
	
	public int getResultRegularTime() {
		int resposta = 0;
		if (getScoreHome() - getScoreAway() > 0) {
			
			 resposta = 1;
			
		} else {
			
			if (getScoreHome() - getScoreAway() == 0) {
				
				resposta = 0;
				
			}else {
				
				resposta = 2;
			}
			
			
		}
		return resposta;
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

	public int getScoreHome() {
		return scoreHome;
	}

	public void setScoreHome(int scoreHome) {
		this.scoreHome = scoreHome;
	}

	public int getScoreAway() {
		return scoreAway;
	}

	public void setScoreAway(int scoreAway) {
		this.scoreAway = scoreAway;
	}

	public int getScoreHomeET() {
		return scoreHomeET;
	}

	public void setScoreHomeET(int scoreHomeET) {
		this.scoreHomeET = scoreHomeET;
	}

	public int getScoreAwayET() {
		return scoreAwayET;
	}

	public void setScoreAwayET(int scoreAwayET) {
		this.scoreAwayET = scoreAwayET;
	}

	public int getScoreHomePenalties() {
		return scoreHomePenalties;
	}

	public void setScoreHomePenalties(int scoreHomePenalties) {
		this.scoreHomePenalties = scoreHomePenalties;
	}

	public int getScoreAwayPenalties() {
		return scoreAwayPenalties;
	}

	public void setScoreAwayPenalties(int scoreAwayPenalties) {
		this.scoreAwayPenalties = scoreAwayPenalties;
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
