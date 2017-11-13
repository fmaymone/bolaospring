package com.bolao.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Pool {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@ManyToMany
	@JoinTable(name="POOL_USER",
	joinColumns = @JoinColumn(name="POOL_ID"), 
	inverseJoinColumns = @JoinColumn(name="USER_ID"))
	//join coumn pool_id
	//inverse join column user_id
	private List<User> users = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void addUsers(User user) {
		this.users.add(user);
	}

	public Pool(String name) {
		super();
		this.name = name;
		
	}
	
	protected Pool() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Pool de id: %s , com nome: %s ", this.id, this.name);
	}
	
	


}
