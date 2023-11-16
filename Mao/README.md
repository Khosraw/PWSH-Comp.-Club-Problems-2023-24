# Mao

In the game of *Mao*, players play with a standard 52-card deck of cards and
create the rules they go. At the end of every
round, a new rule is added. The Plano West CS Officers are playing a game of 
Mao. However, since the officers are particularly unoriginal people, in 
every game of Mao they play, the first three rules they use are the same:

1. *Suits Rule*: A club must be followed by a club or diamond. A diamond
must be followed by a heart or spade. A heart must be followed by a heart
or club. A spade must be followed by a diamond or spade.
2. *Difference Rule*: Consecutive cards played must have a difference of $d$ or $d + 1$, with wraparound allowed. (Thus, a Jack and an Ace can be said to
have a difference of 3 or 10). 
3. *Divisibility Rule*: Cards must alternate being divisible and not being
divisible by $x$. 

To keep things interesting, the order these three rules are added and the
values of $d$ and $x$ are changed every time the officers play a game of 
Mao. It is currently round 3 of their game (so 2 rules have been added), and
Alex has seen 5 cards played. However, Alex has suddenly forgotten which two
rules have been instituted, as well as the values of $d$ and $x$ if either
rule 2 or 3 has been instituted. It is now Alex's turn.
Given the four cards in Alex's hand, can you tell him which cards are 
playable?

*As a reminder, the card ranks are A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, 
in that order. For the purposes of the divisibility rule, A = 1, J = 11, Q = 
12, and K = 13.*

## Input Format

The first line will contain 5 space-separated tokens. Each token will have
the rank of a card and its suit, in that order. C will be used to denote 
clubs, D for diamonds, H for hearts, and S for spades. These are the five
cards in play, given in the order that they were played. The second line of 
input will have 4 cards, representing the cards in Alex's hand. 

## Output Format

A single line containing a playable card in Alex's hand. If no card is
playable, then output "The Mao gods have befallen me!". Alex is guaranteed to
have at most one playable card, and it will be always possible to determine
which rules are in play, as well as the values of $d$ and $x$, if 
applicable, from the 5 cards given. 

### Sample Input

AH 3H 7C QD 5S

2C 6D KD 4S

### Sample Output

6D

### Sample Case Explanation

**Author: Aaron Zhou**
