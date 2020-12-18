# Card Games
The repository contains the CLI-based card games of which I have developed while completing my masters in Computer Science at the University of Birmingham. Through this assignment, I received 100%. The main focus of this assignment was the creation of the Pontoon/Blackjack card game.




# Pontoon Card Game
Pontoon is a game that has many different names, and is known all over the world. Another name for it is Blackjack. The main attribute of this game is that the players are trying to get a hand of cards with the value 21 or less, but as close to 21 as possible if less than 21. A hand of cards with a value of more than 21 is 'bust' and is not valid. The game is often played by two players with one acting as the 'bank'. You can simply consider it a game of two equal players. The proceeds as follows: 

- at the start of the game each player gets two cards dealt face down. 
- one of the 2 players turns both of their cards. 
- if the value of their two cards sums to less than 16, they must receive another card (also known as a twist). 
- if the value of their cards is between 16 and 21 (inclusive) the player is assumed to be happy with the value of their cards and will stick to their hand automatically and the game moves to the other player. 
- the other player follows the same process and attempts to get a better hand than the rest of player(s).

For the purposes of this assignment, the rank order of hands in the game Pontoon was as follows:
1. (1) A 'Pontoon' is a hand with an ACE and a single card with the value 10, i.e, it comprises of two cards. The value of this hand is 21. This is the best ranked hand in Pontoon and beats all other hands (apartfrom another 'Pontoon').
2. (2) A 'Five Card Trick' is a hand comprising five cards where the value of the hand does not exceed 21.
3. (3) A hand with any number of cards totalling 21.
4. (4) Hands with a total value of 20 or less, the nearer to 21 the better.
5. A hand with a value of more than 21 is 'bust' and is worthless.
