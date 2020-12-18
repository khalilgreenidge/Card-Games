package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	//52 cards inside deck
	//13 cards in a suit
	//4 suits in a deck
	
	ArrayList<Card> cards = new ArrayList<Card>(52);
	//String values[] = Card.Values.values();
	//ArrayList<Card> hearts = new ArrayList<Card>(13);
	
	
	public Deck() {
				
		//suit loop
		int i;
		
		for(Card.Suit s: Card.Suit.values() ) {
			
			for(i=0; i < Card.Values.values().length; i++) {
				
				Card card = new Card(s,Card.Values.values()[i]);
				cards.add(card);
				
			}
			
			i=0;
		}
		shuffle();
		
	}
	
	public void reset() {
		
		//remove all card
		cards.clear();
		
		//start fresh
		int i;
		
		//suit loop
		for(Card.Suit s: Card.Suit.values() ) {
			
			//value loop
			for(i=0; i < Card.Values.values().length; i++) {
				
				Card card = new Card(s,Card.Values.values()[i]);
				cards.add(card);
				
			}
			
			i=0;
		}
	}
	
	public void shuffle() {
		
		Random r = new Random();
		int upperBound = (cards.size() - 1);
		int randomIndex = r.nextInt(upperBound);
		Card tempCard;
		
		for(int i=0; i<cards.size();i++) {
			
			//pop random card
			tempCard = cards.get(randomIndex);
			cards.remove(randomIndex);
			
			//push it into current index
			cards.add(i, tempCard);
		}
		
		
	}
	
	public Card getCard(int i) {
		
		Card card = cards.get(i);
		
		return card;
		
	}
	
	public Card dealRandomCard() {
		
		Random r = new Random();
		int upperBound = (cards.size() - 1);
		int randomIndex = r.nextInt(upperBound);
		
		//get random card
		Card dealCard = getCard(randomIndex);
		
		//remove card
		cards.remove(randomIndex);
		
		return dealCard;
	}
	
	public int size() {
		return cards.size();
	}
	
	public void display() {
		//displays all the cards in the deck
		
		int j = 1;
		for(Card card: cards) {
		
			System.out.println("Card " + j + " = " + card);
			j++;
		}
	}
	
	
}
