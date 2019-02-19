package com.cards.standalone;
public enum Suit {
	CLUB(1), DIAMOND(2), SPADE(3), HEART(4);
	private int value;
	private Suit(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}
