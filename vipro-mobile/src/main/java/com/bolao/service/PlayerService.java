package com.bolao.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bolao.entity.Player;

@Repository
public interface PlayerService {
	
	
	     
	    Player findById(Long id);
	 
	    Player findByName(String name);
	 
	    void savePlayer(Player Player);
	 
	    void updatePlayer(Player Player);
	 
	    void deletePlayerById(Long id);
	 
	    void deleteAllPlayers();
	 
	    List<Player> findAllPlayers();
	 
	    boolean isPlayerExist(Player Player);
	

}
