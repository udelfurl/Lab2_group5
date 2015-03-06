package PokerEngine;
import java.util.ArrayList;
import java.util.Collections;


public class deck {
	
	private ArrayList<card> DeckCards = new ArrayList<card>();
	
	private deck()
	
	{		
		for (int i = 0; i<4; i++) {
			esuit suit = esuit.values()[i];
			for (int j = 0; j<14; j++) {
				eCardValue value = eCardValue.values()[j];
				card c = new card(suit, value);
				DeckCards.add(c);
			}	
		}		
		
		Collections.shuffle(DeckCards);
	
	
	}		

	public card draw()
	{ 	
		card c = DeckCards.get(0);
		DeckCards.remove(c);
		
		return c;
		
	}
	
	public int NumberOfCards()
	{
		return DeckCards.size();
	
	}
}



