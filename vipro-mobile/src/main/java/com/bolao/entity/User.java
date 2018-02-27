package com.bolao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class User {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public User(String name) {
		super();
		this.name = name;
		
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Column
	private String name;
	
	@Column
	private String email;
	
	@ManyToMany(mappedBy="users")
	private List<Pool> pools = new ArrayList<>();
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pool> getPools() {
		return pools;
	}

	public void addPools(Pool pools) {
		this.pools.add(pools);
	}

	protected User() {
		
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Usuario de id: %s , com email: %s e nome: %s ", this.id, this.email, this.name);
	}
	


}
