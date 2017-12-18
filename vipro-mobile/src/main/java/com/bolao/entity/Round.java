package com.bolao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bolao.util.Phases;

@Entity
public class Round {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String title;

	@Column
	private Date start_at;

	@Column
	private Date end_at;

	@Enumerated
	private Phases phase;

	@OneToMany(mappedBy = "round")
	private List<Match> matches = new ArrayList<>();

	public Round(Phases phase) {

		this.phase = phase;
	}
	
	public Round() {
	}
	

	public Round(String idPhase) {
		
		
		
		
		
		switch (idPhase) {
		case "0":
			this.phase = Phases.PHASE_FIRST;
			break;
		case "1":
			this.phase = Phases.PHASE_8THS;
			break;
		case "2":
			this.phase = Phases.PHASE_4THS;
			break;
		case "3":
			this.phase = Phases.PHASE_2THS;
			break;
		case "4":
			this.phase = Phases.PHASE_3RD;
			break;
		case "5":
			this.phase = Phases.PHASE_FINAL;
			break;

		default:
			break;
		}
		
	
	
		
		
	}

	public void addMatch(Match match) {

		this.matches.add(match);

	}

	public void removeMatch(Match match) {

		this.matches.remove(match);

	}

	public Phases getPhase() {
		return phase;
	}

	public void setPhase(Phases phase) {
		this.phase = phase;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart_at() {
		return start_at;
	}

	public void setStart_at(Date start_at) {
		this.start_at = start_at;
	}

	public Date getEnd_at() {
		return end_at;
	}

	public void setEnd_at(Date end_at) {
		this.end_at = end_at;
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

}
