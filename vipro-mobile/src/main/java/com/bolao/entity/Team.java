package com.bolao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration 

@Entity
@NamedQuery(name="find_all_teams", query="select t from Team t")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column
	private String name;
	public Team(Long l, String string) {
		this.id = l;
		this.name = string;
	}
	public Team() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
