package PokerEngine;
import java.util.Arrays;


public class hand {
	private card[] cards;
	private int[] value;
	
	hand(deck d)
	{
		value = new int[6];
		cards = new card[5];
		for (int x = 0; x<5; x++)
		{
			cards[x] = d.draw(); // fills up the hand with cards which is an array
		}
		
		Arrays.sort(cards);
	}
	
		private boolean RoyalFlush(){
			if Flush()==true;
				if((cards[0].value==10)&&{
				(cards[1].value==11)&&
				(cards[2].value==12)&&
				(cards[3].value==13)&&(cards[4].value==14));
				{
					return true;
				}
			else{
				return false;
			}
		private boolean Flush(){
			if((cards[0].getsuit==cards[1].getsuit)
				&& cards[1].suit==cards[2].suit
				&& cards[2].suit==cards[3].suit
				&& cards[3].suit==cards[4].suit
				{
					return true;
				}
			else{
				return false;
			}
		}
		private boolean Straight(){
			if ((cards[0]+1 == cards[1])
					&& cards[1]+1 == cards[2]
					&& cards[2]+1 == cards[3]
					&& cards[3]+1 == cards[4];
					{
						return true;
					}
					else{
						return false;
					}
		}
		private boolean FourOfAKind(){
			if (cards[0]== cards[3]
					|| cards[1] == cards[4])
			{
				return true;
			}
			else{
				return false;
			}
		}


}
