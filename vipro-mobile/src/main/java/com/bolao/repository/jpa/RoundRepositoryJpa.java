package com.bolao.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Round;
import com.bolao.entity.Team;
import com.bolao.util.Phases;

@RepositoryRestResource(path="rounds")
public interface RoundRepositoryJpa extends JpaRepository<Round,Long> {
	
	
	Round findByPhase(int phase);

	Round findByPhase(Phases phase);
	
	

}
