package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

public class Pontoon extends CardGame{

	public Pontoon(int nplayers) {
		super(nplayers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dealInitialCards() {
		// TODO Auto-generated method stub
		
		//deal each player two cards
		for(int i=0; i < players.size(); i++) {
			
			for(int j=0; j < 2; j++) {
				//deals two cards to a player's hand
				players.get(i).dealToPlayer(deck.dealRandomCard());				
			}	
			
		}
		
	}

	@Override
	public int compareHands(Player hand1, Player hand2) {
		
		//get play 1 hand
		int rank1 = 0, rank2 = 0, result = 0, total1 = 0, total2 = 0;
		
		rank1 = getRank(hand1);
		rank2 = getRank(hand2);
		
		if(rank1 < rank2)
			//player1 has the better hand
			result = -1;
		
		else if(rank2 < rank1)
			//player2 has the better hand
			result = 1;
		
		else if(rank1 == rank2) {
			//check to see who has the closes total to 21
			total1 = getTotalHand(hand1);
			total2 = getTotalHand(hand2);
			if(total1 > total2)
				result = -1;
			else if(total2 > total1)
				result = 1;
			else
				//totals are equal
				result = 0;			
		}		
		else
			result = 0;
		
		return result;		
	}

	public int getRank(Player p) {
		
		ArrayList<Card> hand = p.getCards();
		int rank = 0;
		int total = 0;
		
		//get total of numerical value of hand.
		total = getTotalHand(hand);
		
		//if total < 16 --> must deal another card to that player			
		while(total < 16){
						
			p.dealToPlayer(deck.dealRandomCard());
			System.out.println(p.getName() + " gets twisted. They received a new card.");
			System.out.println(p.getName() + "'s hand is: ");
			p.displayCardsInHand();
			System.out.println("Numerical Hand: " + p.getNumericalHandValue() + "\n");
			
			total = getTotalHand(hand);
		}					
		
		
		//check for rank 1 - if hand = ACE + a 10 card --> rank = 1		
		if(hand.size() == 2 && total == 21) {			
			//PONTOON!
			rank = 1;			
		}
		
		else if(hand.size() == 5 && total <= 21){
			//FIVE CARD TRICK!
			rank = 2;
		}
		
		else if(hand.size() != 5 && total == 21) 
			//A HAND WITH ANY NUMBER OF CARDS, TOTALLING 21
			rank = 3;
		
		else if(total <= 20)
			//close to 21 hand									
			rank = 4;
		
		else if(total > 21)
			//bust
			rank = 5;
		
		return rank;
	}
	
	public int getTotalHand(ArrayList<Card> hand) {
		
		int total = 0;
		
		for(Card card: hand) {
			if(card.getValue() != Card.Values.ACE) {
				total += card.getNumericalValue().get(0);
			}
			else {
				//calculate for 1 ace
				if(total > 10)
					total += 1;
				else
					total += 11;
			}
		}
		
		return total;
	}
	
	//overloading
	public int getTotalHand(Player p) {
		
		int total = 0;
		ArrayList<Card> hand = p.getCards();
		
		for(Card card: hand) {
			if(card.getValue() != Card.Values.ACE) {
				total += card.getNumericalValue().get(0);
			}
			else {
				//calculate for 1 ace
				if(total > 10)
					total += 1;
				else
					total += 11;
			}
		}
		
		return total;
	}
	
}
	