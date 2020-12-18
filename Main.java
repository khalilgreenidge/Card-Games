package com.bham.pij.assignments.pontoon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pontoon game1 = new Pontoon(2);
		
		//get num of players
		System.out.println("Number of players are: " + game1.getNumPlayer() );
		//game1.deck.display();
		
		//deal cards;
		game1.dealInitialCards();
		
		//get player1 hand
		game1.showPlayerHands();
		
		
		//compare hands
		for(int i=1; i < game1.getNumPlayer(); i++) {
			System.out.println("\nRound "+ i);
			System.out.println("\n Comparing " + game1.players.get(i-1).getName() + " and " + game1.players.get(i).getName() + " hands...\n");
			
			if(game1.compareHands(game1.players.get(i-1), game1.players.get(i)) == -1)
				System.out.println(game1.players.get(i-1).getName() + " wins!");
			else if(game1.compareHands(game1.players.get(i-1), game1.players.get(i)) == 1)
				System.out.println(game1.players.get(i).getName() + " wins!");
			else
				System.out.println("Draw between " + game1.players.get(i-1).getName() + " and " + game1.players.get(i).getName() );
			
		}
		
	}

}
