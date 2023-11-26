# You Only Live Twice

Jennie was playing The Game of Life with her friends over the weekend. The game has a linear path of tiles and simulates a person’s entire lifetime, including game elements such as choosing a career, raising a family, buying a home, and more. However, after a few rounds of the game, they felt like the simulation wasn’t realistic enough and wanted to up the stakes. 

The friend group decided on a few new rules:
- When players land on the newly created “election” tile, they will have to run for office at the end of the round.
- Out of the players on the election tile, the person with the most game money will become the leader of their city and receive the benefit of a bowl of ice cream in the real world.
- Once the leader has served their term of one round, they will be removed from office and can continue on from the election tile. The new leader will be chosen after the next round.
- Players can not leave the election tile without winning the election. Past leaders can continue further in The Game of Life.
- To allow players to scout their competitors, each player can only move one square at a time. 

If Jennie knows how much money each person has, as well as their distance from the election tile, can you determine how many rounds it will take for her to get a bowl of delicious ice cream? Assume no two players have the same wealth.

### Input Format

The first line will contain an integer, $N$, denoting the number of players that are playing The Game of Life. The second line will contain the integers representing Jennie’s game wealth, $w$, and her distance from the election tile, $d$. The next $N-1$ lines will contain the rest of the players’ wealths and distances from the election tile in the same space-separated format. 
Note that there will always be at least one person on the election tile at any point in the game (until the end). 

### Constraints

$2 \leq N \leq 2^{15}$

$0 \leq w \leq 2^{31}-1$

$0 \leq d \leq N-1$

### Output Format

The integer number of rounds it will take for Jennie to become the leader.

### Sample Input 
```
5
30000 1
20000 0
50000 0
90000 2
40000 2
```

### Sample Output
```
2
```

### Sample Case Explanation

In the first round, the player with $50,000 has more money than the person with $20,000, so the richer player becomes the leader and moves on. This leaves the second round with the player with $20,000 and Jennie, who has moved to the election tile and has $30,000. In this round, Jennie has more money and becomes the leader. As a result, it took two rounds for Jennie to win. 

**Author: Teagan Gao**
