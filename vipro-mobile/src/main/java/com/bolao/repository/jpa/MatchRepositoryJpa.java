package com.bolao.repository.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bolao.entity.Match;

@RepositoryRestResource(path="matches")
@CrossOrigin
public interface MatchRepositoryJpa extends JpaRepository<Match,Long> {
	


	

}
