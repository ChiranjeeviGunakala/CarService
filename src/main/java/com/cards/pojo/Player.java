/**
 * 
 */
package com.cards.pojo;

import java.util.List;

/**
 * @author 677644
 *
 */
public class Player {
	
	private String name;
	private List<Card> card;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getCard() {
		return card;
	}
	public void setCard(List<Card> card) {
		this.card = card;
	}
	
	

}
