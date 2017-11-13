package com.bolao.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Competition {
	
	public Competition() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@DateTimeFormat
	private Date start_at;
	
	@DateTimeFormat
	private Date end_at;
	
	
	public Competition(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public String toString() {
		return "Competition [id=" + id + ", name=" + name + ", start_at=" + start_at + ", end_at=" + end_at + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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


	
	
	
	
	
	
	
	
	



}
