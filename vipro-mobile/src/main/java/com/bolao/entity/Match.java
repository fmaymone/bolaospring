package com.bolao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Match {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
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
	
	
	
	
	
	
	



}
