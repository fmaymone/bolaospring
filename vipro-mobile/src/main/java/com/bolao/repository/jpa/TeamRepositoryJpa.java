package com.bolao.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Team;

@RepositoryRestResource(path="teams")
public interface TeamRepositoryJpa extends JpaRepository<Team,Long> {
	
	List<Team> findByName(String name);
	List<Team> findBySeedOnCompetition(String seedOnCompetition);

}
