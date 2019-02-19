package com.cards.pojo;

public enum Suit {
	
	Clubs(1),
	Diamonds(2),
	Spades(3),
	Hearts(4);
	
	private final int value;

    private Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static void main(String args[]){
    
    	System.out.println(Suit.Clubs.value);
    }

}
