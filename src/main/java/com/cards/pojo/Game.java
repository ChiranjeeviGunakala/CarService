/**
 * 
 */
package com.cards.pojo;

import java.util.List;

/**
 * @author 677644
 *
 */
public class Game {
	
	private String name;
	private List<Player> player;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

}
