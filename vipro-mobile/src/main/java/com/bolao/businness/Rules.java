package com.bolao.businness;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class Rules {

	public static double NUMBER_POINTS_WINNER_MATCH;
	public static double NUMBER_POINTS_HOME_GOALS;
	public static double NUMBER_POINTS_AWAY_GOALS;
	public static double NUMBER_POINTS_DRAW;
	public static double NUMBER_POINTS_DRAW_GOALS;

	public static double NUMBER_POINTS_8THS_CLASSIFIED;
	public static double NUMBER_POINTS_8THS_EACH_TEAM;
	public static double NUMBER_POINTS_4THS_CLASSIFIED;
	public static double NUMBER_POINTS_4THS_EACH_TEAM;
	public static double NUMBER_POINTS_2THS_CLASSIFIED;
	public static double NUMBER_POINTS_2THS_EACH_TEAM;
	public static double NUMBER_POINTS_FINALS_CLASSIFIED;
	public static double NUMBER_POINTS_FINALS_EACH_TEAM;
	public static double NUMBER_POINTS_CHAMPION;
	public static double NUMBER_POINTS_FORMER_CHAMPION;
	public static double NUMBER_POINTS_THIRD_PLACE;
	public static double NUMBER_POINTS_FORTH_PLACE;

	private double numberPointsWinnerMatch;
	private double numberPointsHomeGoals;
	private double numberPointsAwayGoals;
	private double numberPointsDraw;
	private double numberPointsDrawGoals;

	private double numberPoints8thsClassified;
	private double numberPoints8thsEachTeam;
	private double numberPoints4thsClassified;
	private double numberPoints4thsEachTeam;
	private double numberPoints2thsClassified;
	private double numberPoints2thsEachTeam;
	private double numberPointsFinalsClassified;
	private double numberPointsFinalsEachTeam;
	private double numberPointsChampion;
	private double numberPointsFormerChampion;
	private double numberPointsThirdPlace;
	private double numberPointsForthPlace;

	public double getNumberPoints8thsClassified() {
		return numberPoints8thsClassified;
	}

	public void setNumberPoints8thsClassified(double numberPoints8thsClassified) {
		this.numberPoints8thsClassified = numberPoints8thsClassified;
	}

	public double getNumberPoints8thsEachTeam() {
		return numberPoints8thsEachTeam;
	}

	public void setNumberPoints8thsEachTeam(double numberPoints8thsEachTeam) {
		this.numberPoints8thsEachTeam = numberPoints8thsEachTeam;
	}

	public double getNumberPoints4thsClassified() {
		return numberPoints4thsClassified;
	}

	public void setNumberPoints4thsClassified(double numberPoints4thsClassified) {
		this.numberPoints4thsClassified = numberPoints4thsClassified;
	}

	public double getNumberPoints4thsEachTeam() {
		return numberPoints4thsEachTeam;
	}

	public void setNumberPoints4thsEachTeam(double numberPoints4thsEachTeam) {
		this.numberPoints4thsEachTeam = numberPoints4thsEachTeam;
	}

	public double getNumberPoints2thsClassified() {
		return numberPoints2thsClassified;
	}

	public void setNumberPoints2thsClassified(double numberPoints2thsClassified) {
		this.numberPoints2thsClassified = numberPoints2thsClassified;
	}

	public double getNumberPoints2thsEachTeam() {
		return numberPoints2thsEachTeam;
	}

	public void setNumberPoints2thsEachTeam(double numberPoints2thsEachTeam) {
		this.numberPoints2thsEachTeam = numberPoints2thsEachTeam;
	}

	public double getNumberPointsFinalsClassified() {
		return numberPointsFinalsClassified;
	}

	public void setNumberPointsFinalsClassified(double numberPointsFinalsClassified) {
		this.numberPointsFinalsClassified = numberPointsFinalsClassified;
	}

	public double getNumberPointsFinalsEachTeam() {
		return numberPointsFinalsEachTeam;
	}

	public void setNumberPointsFinalsEachTeam(double numberPointsFinalsEachTeam) {
		this.numberPointsFinalsEachTeam = numberPointsFinalsEachTeam;
	}

	public double getNumberPointsChampion() {
		return numberPointsChampion;
	}

	public void setNumberPointsChampion(double numberPointsChampion) {
		this.numberPointsChampion = numberPointsChampion;
	}

	public double getNumberPointsFormerChampion() {
		return numberPointsFormerChampion;
	}

	public void setNumberPointsFormerChampion(double numberPointsFormerChampion) {
		this.numberPointsFormerChampion = numberPointsFormerChampion;
	}

	public double getNumberPointsThirdPlace() {
		return numberPointsThirdPlace;
	}

	public void setNumberPointsThirdPlace(double numberPointsThirdPlace) {
		this.numberPointsThirdPlace = numberPointsThirdPlace;
	}

	public double getNumberPointsForthPlace() {
		return numberPointsForthPlace;
	}

	public void setNumberPointsForthPlace(double numberPointsForthPlace) {
		this.numberPointsForthPlace = numberPointsForthPlace;
	}

	public double getNumberPointsWinnerMatch() {
		return numberPointsWinnerMatch;
	}

	public void setNumberPointsWinnerMatch(double numberPointsWinnerMatch) {
		this.numberPointsWinnerMatch = numberPointsWinnerMatch;
	}

	public double getNumberPointsHomeGoals() {
		return numberPointsHomeGoals;
	}

	public void setNumberPointsHomeGoals(double numberPointsHomeGoals) {
		this.numberPointsHomeGoals = numberPointsHomeGoals;
	}

	public double getNumberPointsAwayGoals() {
		return numberPointsAwayGoals;
	}

	public void setNumberPointsAwayGoals(double numberPointsAwayGoals) {
		this.numberPointsAwayGoals = numberPointsAwayGoals;
	}

	public double getNumberPointsDraw() {
		return numberPointsDraw;
	}

	public void setNumberPointsDraw(double numberPointsDraw) {
		this.numberPointsDraw = numberPointsDraw;
	}

	public double getNumberPointsDrawGoals() {
		return numberPointsDrawGoals;
	}

	public void setNumberPointsDrawGoals(double numberPointsDrawGoals) {
		this.numberPointsDrawGoals = numberPointsDrawGoals;
	}

	public Rules() {
		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Rules>> mapType = new TypeReference<List<Rules>>() {
		};
		InputStream is = TypeReference.class.getResourceAsStream("/rules.json");
		try {
			List<Rules> stateList = mapper.readValue(is, mapType);

			Rules.NUMBER_POINTS_AWAY_GOALS = stateList.get(0).getNumberPointsAwayGoals();
			Rules.NUMBER_POINTS_HOME_GOALS = stateList.get(0).getNumberPointsHomeGoals();
			Rules.NUMBER_POINTS_DRAW = stateList.get(0).getNumberPointsDraw();
			Rules.NUMBER_POINTS_DRAW_GOALS = stateList.get(0).getNumberPointsDrawGoals();
			Rules.NUMBER_POINTS_WINNER_MATCH = stateList.get(0).getNumberPointsWinnerMatch();
			Rules.NUMBER_POINTS_8THS_CLASSIFIED = stateList.get(0).getNumberPoints8thsClassified();
			Rules.NUMBER_POINTS_8THS_EACH_TEAM = stateList.get(0).getNumberPoints8thsEachTeam();
			Rules.NUMBER_POINTS_4THS_CLASSIFIED = stateList.get(0).getNumberPoints4thsClassified();
			Rules.NUMBER_POINTS_4THS_EACH_TEAM = stateList.get(0).getNumberPoints4thsEachTeam();
			Rules.NUMBER_POINTS_2THS_CLASSIFIED = stateList.get(0).getNumberPoints2thsClassified();
			Rules.NUMBER_POINTS_2THS_EACH_TEAM = stateList.get(0).getNumberPoints2thsEachTeam();
			Rules.NUMBER_POINTS_FINALS_CLASSIFIED = stateList.get(0).getNumberPointsFinalsClassified();
			Rules.NUMBER_POINTS_FINALS_EACH_TEAM = stateList.get(0).getNumberPointsFinalsEachTeam();
			Rules.NUMBER_POINTS_CHAMPION = stateList.get(0).getNumberPointsChampion();
			Rules.NUMBER_POINTS_FORMER_CHAMPION = stateList.get(0).getNumberPointsFormerChampion();
			Rules.NUMBER_POINTS_THIRD_PLACE = stateList.get(0).getNumberPointsThirdPlace();
			Rules.NUMBER_POINTS_FORTH_PLACE = stateList.get(0).getNumberPointsForthPlace();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
