You are playing a game of Big 2 with your friends. The premise of Big 2 is simple. Your main objective is to get rid of all the card in your hand. To discard a card(s), you must play them on your turn while ensuring the card(s) you place are equal to or higher than the most recent card(s) played. All players must follow this rule. The cards' value are based off their number, with 3 being the smallest and 2 being the highest. Jokers are, as always, the highest cards. (3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A, 2, Small Joker, Large Joker). The game is played with one standard poker deck. For example, if the most recent card played was a 4, you may play another 4 or higher value card. Similarly, if someone played a double, such as a pair of 7's, you may play another pair of 7's or a higher value pair. Doubles, triples, and 4 of-a-kind can be played as long as you are either 1. the first person to go or 2. the most recent cards played are of the same amount, ie: you may only play triples if the other people played triples, or if you are starting the 'round'. A round ends when no one else can or is willing to play a larger card. After the round ends, the player who played the last card goes first and is able to play any valid combination of cards. The combinations of card(s) playable are as follows: 
1. A single card
2. A two of a kind
3. A three of a kind
4. A four of a kind
5. A straight (must be at least 5 cards in length)
	1. A straight works similarly to other combinations: to beat it, a player must play a straight of the same length and the highest card in that straight must be either equal to or higher than the highest value of the previous straight.

In this game, an odd pattern occurs. The game always starts on your turn. Assume each 'round' always ends before you go twice, therefore each of your 'turns' is always one round. Assume you never wind any round, and are therefore bound by the cards other players play. Turns that are divisible by two will be have pairs, turns divisible by three will have three of a kind, turns divisible by four will have four of a kind, and turns divisible by five will have straights. Any turn not divisible by any of these will have singles. When a turn is divisible by more than one of these conditions, such as turn 4, always go with the higher factor, which in this case is 4. Given these conditions and your hand, determine how many turns it will take for you to dispose your entire hand. Assume that the game will not end until your hand is disposed of. Do not take into account other player's cards, both amount of cards and type of cards. The cards given to you will always be possible within a standard deck of cards. 

Input format:
A single number _N_ representing the number of cards in your hand. The next line contains _N_ numbers and/or characters, each representing a card type. All letters will be capitalized. 

Output format:
A single number representing the number of turns taken before all cards in your hand are disposed of. 

Sample Input:
10
3 4 5 6 7 10 10 J Q 2

Sample Output:
11

Explanation:
On turn 1, play any of the singles (J). On turn 2, play the pair of 10's. On turn 3 and 4, pass. On turn 5, play your straight (3, 4, 5, 6, 7). On turn 6, skip. On turn 7, play another single (q). On turn 8, 9, and 10, pass. On turn 11, play your final card, 2. 