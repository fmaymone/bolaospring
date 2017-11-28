package com.bolao.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Round;

@RepositoryRestResource(path="rounds")
public interface RoundRepositoryJpa extends JpaRepository<Round,Long> {
	
	

}
