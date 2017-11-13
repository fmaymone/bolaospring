package com.bolao.entity;

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

	public void setRound(Round round) {
		this.round = round;
	}

	@Column
	private int num;
	
	@Column
	private boolean knockout;
	
	@Column
	private int score1;
	
	@Column
	private int score2;
	
	@Column
	private int score1et;
	
	@Column
	private int score2et;
	
	@Column
	private int score1penalties;
	
	@Column
	private int score2penalties;
	
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

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public int getScore1et() {
		return score1et;
	}

	public void setScore1et(int score1et) {
		this.score1et = score1et;
	}

	public int getScore2et() {
		return score2et;
	}

	public void setScore2et(int score2et) {
		this.score2et = score2et;
	}

	public int getScore1penalties() {
		return score1penalties;
	}

	public void setScore1penalties(int score1penalties) {
		this.score1penalties = score1penalties;
	}

	public int getScore2penalties() {
		return score2penalties;
	}

	public void setScore2penalties(int score2penalties) {
		this.score2penalties = score2penalties;
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
