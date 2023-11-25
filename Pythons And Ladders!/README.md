# Pythons and Ladders!

Alice is playing the famous worldwide classic board game Pythons and Ladders, where players navigate up a 100-square board one square at a time, landing on snakes and ladders that may take you upwards and downwards. However, she has lost every single game to her friend Bob! Alice suspects that Bob may be cheating by secretly moving his piece forwards while she is not paying attention. She knows that if Bob lands on a square that cannot possibly be reached, then he must be cheating! Given a board with $S$ snakes and $L$ ladders, determine whether or not a certain square is reachable.

## Input Format

The first line contains two positive integers $N,T \leq 10^3$, representing the (N)umber of pythons and ladders and the amount of (T)estcases.
The following $N$ lines each contain two positive integers $A < B$ and a character 'P' or 'L' representing a (P)ython or (L)adder. Players move downwards on pythons from $B$ to $A$ and upwards on ladders from $A$ to $B$. It is guaranteed that no pythons or ladders begin on the same square.
The following $T$ lines contain a single positive integers $X \leq 100$.

## Output Format

$T$ lines, where "FAIR PLAY" is printed if the square $X$ is reachable and "CHEATER!" if it is not.

## Sample Input

3 3
2 95 L
96 52 P
55 99 L
12 
54
77

## Sample Output
CHEATER!
FAIR PLAY
CHEATER!

## Sample Explanation
Any player will follow this path: 1 -> 2 -> 95 -> 96 -> 52 -> 53 -> 54 -> 55 -> 99 -> 100.

**Author: Alex Zheng**
