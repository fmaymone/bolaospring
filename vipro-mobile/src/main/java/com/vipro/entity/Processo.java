package com.vipro.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
public class Processo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String status;
	
	@UpdateTimestamp
	@Column(name="LASTUPDATEDDATE")
	private Calendar lastUpdatedDate;
	
	@CreationTimestamp
	@Column(name="CREATEDDATE")
	private Calendar createdDate;
	
	protected Processo() {}

	public Processo(String status) {
		
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String toString() {
		
		return String.format("Processo [status=%s]", status);
	}
	


}
