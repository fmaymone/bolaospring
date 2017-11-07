package com.bolao.service;

import java.util.List;

import com.bolao.entity.Player;

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
