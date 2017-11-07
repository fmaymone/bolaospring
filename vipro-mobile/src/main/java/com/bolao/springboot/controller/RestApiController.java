package com.bolao.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bolao.entity.Player;
import com.bolao.service.PlayerService;

@RestController
@RequestMapping("/api")
public class RestApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
 
    @Autowired
    PlayerService PlayerService; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Players---------------------------------------------
 
    @RequestMapping(value = "/Player/", method = RequestMethod.GET)
    public ResponseEntity<List<Player>> listAllPlayers() {
        List<Player> Players = PlayerService.findAllPlayers();
        if (Players.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Player>>(Players, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single Player------------------------------------------
 
    @RequestMapping(value = "/Player/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getPlayer(@PathVariable("id") long id) {
        logger.info("Fetching Player with id {}", id);
        Player Player = PlayerService.findById(id);
        if (Player == null) {
            logger.error("Player with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Player with id " + id 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Player>(Player, HttpStatus.OK);
    }
 
    // -------------------Create a Player-------------------------------------------
 
    @RequestMapping(value = "/Player/", method = RequestMethod.POST)
    public ResponseEntity<?> createPlayer(@RequestBody Player Player, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Player : {}", Player);
 
        if (PlayerService.isPlayerExist(Player)) {
            logger.error("Unable to create. A Player with name {} already exist", Player.getName());
            return new ResponseEntity(new CustomErrorType("Unable to create. A Player with name " + 
            Player.getName() + " already exist."),HttpStatus.CONFLICT);
        }
        PlayerService.savePlayer(Player);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/api/Player/{id}").buildAndExpand(Player.getId()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
    // ------------------- Update a Player ------------------------------------------------
 
    @RequestMapping(value = "/Player/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updatePlayer(@PathVariable("id") long id, @RequestBody Player Player) {
        logger.info("Updating Player with id {}", id);
 
        Player currentPlayer = PlayerService.findById(id);
 
        if (currentPlayer == null) {
            logger.error("Unable to update. Player with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to upate. Player with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
 
        currentPlayer.setName(Player.getName());
      //  currentPlayer.setAge(Player.getAge());
        //currentPlayer.setSalary(Player.getSalary());
 
        PlayerService.updatePlayer(currentPlayer);
        return new ResponseEntity<Player>(currentPlayer, HttpStatus.OK);
    }
 
    // ------------------- Delete a Player-----------------------------------------
 
    @RequestMapping(value = "/Player/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePlayer(@PathVariable("id") long id) {
        logger.info("Fetching & Deleting Player with id {}", id);
 
        Player Player = PlayerService.findById(id);
        if (Player == null) {
            logger.error("Unable to delete. Player with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("Unable to delete. Player with id " + id + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        PlayerService.deletePlayerById(id);
        return new ResponseEntity<Player>(HttpStatus.NO_CONTENT);
    }
 
    // ------------------- Delete All Players-----------------------------
 
    @RequestMapping(value = "/Player/", method = RequestMethod.DELETE)
    public ResponseEntity<Player> deleteAllPlayers() {
        logger.info("Deleting All Players");
 
        PlayerService.deleteAllPlayers();
        return new ResponseEntity<Player>(HttpStatus.NO_CONTENT);
    }
 
}