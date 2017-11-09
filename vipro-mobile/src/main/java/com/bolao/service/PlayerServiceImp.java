package com.bolao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Player;
import com.bolao.repository.PlayerRepository;

@Service("playerService")
@Transactional
public class PlayerServiceImp implements PlayerService {
	
	 @Autowired
	    private PlayerRepository PlayerRepository;
	 
	    public Player findById(Long id) {
	        return PlayerRepository.findById(id);
	    }
	 
	    public Player findByName(String name) {
	        return PlayerRepository.findByName(name);
	    }
	 
	    public void savePlayer(Player Player) {
	        PlayerRepository.save(Player);
	    }
	 
	    public void updatePlayer(Player Player){
	        savePlayer(Player);
	    }
	 
	    public void deletePlayerById(Long id){
	        PlayerRepository.deleteById(id);
	    }
	 
	    public void deleteAllPlayers(){
	        PlayerRepository.deleteAll();
	    }
	 
	    public List<Player> findAllPlayers(){
	        return PlayerRepository.findAll();
	    }
	 
	    public boolean isPlayerExist(Player Player) {
	        return findByName(Player.getName()) != null;
	    }
	
	

}
