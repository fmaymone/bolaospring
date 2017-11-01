package com.bolao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration 

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
