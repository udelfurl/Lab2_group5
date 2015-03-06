package PokerEngine;

public class card {
	public esuit getesuit() {
		return suit;
	}

	public eCardValue geteCardValue() {
		return value;
	}
	
	private esuit suit;
	private eCardValue value;

	public card(esuit suit, eCardValue value)
	{	
		this.suit=suit;
		this.value=value;
	}
	



}
