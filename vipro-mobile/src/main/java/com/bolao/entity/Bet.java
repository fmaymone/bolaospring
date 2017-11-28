package com.bolao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.apache.tomcat.util.bcel.classfile.Constant;

import com.bolao.util.Constants;

@Entity
public class Bet {

	private static final double NUMBER_POINTS_WINNER_MATCH = 3;
	private static final double NUMBER_POINTS_HOME_GOALS = (double) 1.5;
	private static final double NUMBER_POINTS_AWAY_GOALS = (double) 1.5;
	private static final double NUMBER_POINTS_DRAW = 4;
	private static final double NUMBER_POINTS_DRAW_GOALS = (double) 2.0;

	public Bet(User user, Match match, int scoreHome, int scoreAway) {
		super();
		this.user = user;
		this.match = match;
		this.scoreHome = scoreHome;
		this.scoreAway = scoreAway;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
		return "Bet [id=" + id + ", user=" + user + ", match=" + match + ", scoreHome=" + scoreHome + ", scoreAway="
				+ scoreAway + ", away=" + away + ", home=" + home + "]";
	}

	public double calculatePointsBet() {

		double points = calculatePointsMatch();

		if (this.match.isKnockout()) {

			points += calculatePointsKnockOut();
		}

		return points;

	}

	public double calculatePointsMatch() {

		double resposta = 0;

		if (hasHitWinner()) {
			
			//if was a draw
			if (this.getMatch().getResultRegularTime() == 0) {
				
				resposta += NUMBER_POINTS_DRAW;
				
				if (getScoreAway() == this.getMatch().getScoreAway()) {

					resposta += NUMBER_POINTS_DRAW_GOALS;

				}

			} else {
				resposta += NUMBER_POINTS_WINNER_MATCH;

				if (getScoreAway() == this.getMatch().getScoreAway()) {

					resposta += NUMBER_POINTS_AWAY_GOALS;

				}

				if (getScoreHome() == this.getMatch().getScoreHome()) {

					resposta += NUMBER_POINTS_HOME_GOALS;

				}
			}

		}

		return resposta;
	}

	public double calculatePointsKnockOut() {

		return 8;
	}

	public boolean hasHitWinner() {

		if (this.getResultRegularTime() == match.getResultRegularTime()) {

			return true;
		} else {

			return false;
		}

	}

	public int getResultRegularTime() {
		int resposta = 0;
		if (getScoreHome() - getScoreAway() > 0) {

			resposta = 1;

		} else {

			if (getScoreHome() - getScoreAway() == 0) {

				resposta = 0;

			} else {

				resposta = 2;
			}

		}
		return resposta;
	}

}
