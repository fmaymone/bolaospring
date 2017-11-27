package com.bolao.repository.jpa;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bolao.entity.Bet;
import com.bolao.entity.Match;
import com.bolao.entity.User;

@RepositoryRestResource(path="bets")
public interface BetRepositoryJpa extends JpaRepository<Bet,Long> {
	
	List<Bet> findByUser(User user);
	List<Bet> findByMatch(Match match);

}
