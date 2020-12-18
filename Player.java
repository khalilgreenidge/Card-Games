package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

	ArrayList<Card> hand = new ArrayList<Card>();
	String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void dealToPlayer(Card card) {
		hand.add(card);		
	}
	
	public void removeCard(Card card) {
		hand.remove(card);
	}
	
	public ArrayList<Integer> getNumericalHandValue(){
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		//get the numerical value of each card in the players hand
		
		for(Card card: hand)
			values.addAll(card.getNumericalValue());
			
		Collections.sort(values);
		
		return values;
	
	}
	
	public int getBestNumericalHandValue() {
		
		int max = 0;
		
		//get max value in hand.
		
		for(Card card: hand) {
			
			if(card.getNumericalValue().size() == 1) {
				//comparing only one element of collection
				if(card.getNumericalValue().get(0) > max)
					max = card.getNumericalValue().get(0);
			}
			else
				max = 11;
			
		}
					
		return max;
	}
	
	
	public ArrayList<Card> getCards(){
		
		return hand;
		
	}
	
	public int getHandSize() {
		
		int size = hand.size();
		
		return size;
	}

	
	public void displayCardsInHand() {
		//displays all the cards in the deck
		
		int j = 1;
		for(Card card: hand) {
		
			System.out.println(card);
			j++;
		}
	}
	
}
