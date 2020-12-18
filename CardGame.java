package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

public abstract class CardGame {

	ArrayList<Player> players = new ArrayList<Player>();
	protected  Deck deck;
	
	public CardGame(int nplayers) {
		deck = new Deck();
		
		for(int i=0; i<nplayers; i++) {
			Player p = new Player("Player "+ (i + 1));
			players.add(p);
		}			
		
	}
	
	public void showPlayerHands() {
		
		for(int i =0;i<players.size();i++) {
			System.out.println("\nPlayer "+ (i+1) +"'s hand is: ");
			players.get(i).displayCardsInHand();
			System.out.println("Numerical hand: " + players.get(i).getNumericalHandValue());
		}
		
	}
	
	public abstract void dealInitialCards();
	
	public abstract int compareHands(Player hand1, Player hand2);
	
	public Deck getDeck() {
		return deck;
	}
	
	public Player getPlayer(int i) {		
		return players.get(i) ;
	}
	
	public int getNumPlayer() {
		return players.size();
	}
	
}
