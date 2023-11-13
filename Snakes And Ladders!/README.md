# Snakes and Ladders!

In a twist on the famous worldwide classic board game Snakes and Ladders, you navigate up a board either 1 or 2 spaces at a time from 1-100, landing on snakes and ladders that may take you upwards and downwards.
Given a board with $S$ snakes and $L$ ladders, determine the minimum possible number of moves it takes to reach any given square.

## Input Format

The first line contains positive integers $S, L$, the number of snakes and ladders respectively.
The following $P$ lines contain positive integers $A < B$ representing a snake on which a player can move downwards.
The following $L$ lines contain positive integers $A > B$ representing a ladder on which a player can move upwards.
The next line contains a positive integer $Q$.
The following $Q$ lines contain a positive integer $N$, a square between 1-100 on the board.

## Output Format

$Q$ lines containing the minimum possible number of moves it takes to reach that square.