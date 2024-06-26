# Simultaneous Exhibition

Top chess grandmaster Stock Fish is playing a simultaneous exhibition match: they are playing each of $N$ opponents at the same time.
In fact, Mr. Fish is so good at chess that he knows exactly how many moves he needs to beat each opponent $M_1, M_2, ... M_N$, at which point they will immediately begin playing him again.
(For example, if Stock can win in 2 moves, then he can win 2 games from this opponent in 4 moves).

Your task is to find the shortest amount of total moves Mr. Fish needs to win $G$ games.

## Input Format

The first line contains positive integers $N \leq 10^4, G \leq 10^5$, the number of opponents and the number of games Stock needs to win.
The next line contains $N$ integers, how many moves Mr. Fish needs to beat each opponent $M_1, M_2, ... M_N \leq 10^4$.

## Output Format

Print the minimum number of moves needed to win $G$ games.

### Sample Input
$3$ $7$

$3$ $2$ $5$

### Sample Output
$8$

### Sample Case Explanation
In 8 moves, Stock wins 2, 4, and 1 game against the three opponents respectively, for a total of 7 games won.
