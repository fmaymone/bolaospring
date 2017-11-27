package com.bolao.repository.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Bet;
import com.bolao.entity.Match;

@RepositoryRestResource(path="matches")
public interface MatchRepositoryJpa extends JpaRepository<Match,Long> {
	


	

}
