package com.cards.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cards.pojo.Card;
import com.cards.pojo.Game;
import com.cards.pojo.Player;

/**
 * @author 677644
 *
 */
@RestController
public class CardService {
	
	Game game;
	
	List<Card> ActCard;
	
	@GetMapping("/cardService")
	public String cardService(){
		
		return "Welcome to Paying Cards System ";
	}
	
	@PostMapping(path="/gamePlayStart")
	public String cardsGameStart(@RequestBody Game game){
					
		for(Player players:game.getPlayer()){
			System.out.println("Name of the player :"+players.getName());
			for(Card cards : players.getCard()){
				
				/*System.out.println(Rank.valueOf(cards.getRank()).getValue());
				System.out.println(cards.getSuit());*/
			}
		}
		
		return "Hello";
	}
	

}
