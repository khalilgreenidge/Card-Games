package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

public class Card {
	
	public static enum Suit{CLUBS, HEARTS, DIAMONDS, SPADES};
	public static enum Values{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
	
	private Suit theSuit;
	private Values value;
	
	//ACE - means 1 or 11.
	
	public Card(Suit s, Values v) {
		theSuit = s;
		value = v;
	}
	
	public Suit getSuit() {
		
		//returns suit value of the card.		
		return theSuit;
	}
	
	public Values getValue() {
		
		//returns suit value of the card.		
		return value;
	}
	
	public void setSuit(Suit s) {
		theSuit = s;
	}
	
	public void setValue(Values v) {
		value = v;
	}
	
	
	public ArrayList<Integer> getNumericalValue(){
		
		ArrayList<Integer> valueList = new ArrayList<Integer>(2);
		
		//get the value attribute and add it to the value list
		
		switch(value) {
		
			case ACE:
				valueList.add(1);
				valueList.add(11);
				break;
				
			case TWO:
				valueList.add(2);
				break;
				
			case THREE:
				valueList.add(3);
				break;
				
			case FOUR:
				valueList.add(4);
				break;
				
			case FIVE:
				valueList.add(5);
				break;
				
			case SIX:
				valueList.add(6);
				break;
				
			case SEVEN:
				valueList.add(7);
				break;
				
			case EIGHT:
				valueList.add(8);
				break;
				
			case NINE:
				valueList.add(9);
				break;
				
			case TEN:
				valueList.add(10);
				break;
				
			case JACK:
				valueList.add(10);
				break;
				
			case QUEEN:
				valueList.add(10);
				break;
				
			case KING:
				valueList.add(10);
				break;
		
		}
		
		
		return valueList;
	}
	
	@Override
	public String toString() {		
		return value + " of " + theSuit;
	}
	
	
}
