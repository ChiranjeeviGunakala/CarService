package com.cards.standalone;
public class Card implements Comparable<Card>{

	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public Card(String card) {
		String[] c = card.split("-");
		this.rank = Rank.valueOf(c[0].trim());
		this.suit = Suit.valueOf(c[1].trim());
	}
	
	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return rank+"-"+suit;
	}

	@Override
	public int compareTo(Card other) {
		if (this.rank.getValue() > other.rank.getValue())
			return 1;
		if (this.rank.getValue() < other.rank.getValue())
			return -1;

		if (this.suit.getValue() > other.suit.getValue())
			return 1;
		if (this.suit.getValue() < other.suit.getValue())
			return -1;
		return 0;
	}
}
