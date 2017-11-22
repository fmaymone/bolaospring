package com.bolao.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Match;
import com.bolao.entity.Team;

@RepositoryRestResource(path="matches")
public interface MatchRepositoryJpa extends JpaRepository<Match,Long> {
	


	

}
