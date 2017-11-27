package com.bolao.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Team;
import com.bolao.entity.User;

@RepositoryRestResource(path="teams")
public interface UserRepositoryJpa extends JpaRepository<User,Long> {
	
	

}
