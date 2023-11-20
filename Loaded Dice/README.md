# Loaded Dice

Tired of all of these complicated rules, you decide to return to the comfort of simple dice games. 
You and your friend come up with the following game to pass the time:

$N$ fair six-sided dice, each labeled 1 to 6, are grabbed from a bag. Your friend gives you an integer, $K$, before you roll all the dice. If the sum of the dice equals $K$, then you win. $K$ is always a valid sum.

Obviously, this game is stacked against you. However, you came prepared, and brought a set of sticker labels in the range 1 to 6 that you can tape onto a *singular* die when your friend isn’t looking to change your sum.

Given $T$ games, $N_1...N_T$ roll outcomes per game, and desired sums $K_1...K_T$ per game, find the maximum number of winnable games if you only have one of each sticker label.

### Input Format

The first line of input will contain the integer $T$.
The following game cases will each contain the space-separated integers $N_x$ and $K_x$ on the first line followed by $N$ space-separated integers on the second line, denoting the dice roll outcomes of that game.  

### Output Format

A single integer denoting the maximum number of winnable games.

### Sample Input 
```
2
3 12
1 6 2
4 7
2 2 2 5
```

### Sample Output
```
2
```

### Sample Case Explanation

In the first game, three dice were rolled with a sum of 9. 9 is 3 less than the desired sum, 12, which means the first game can use either the 4 or 5 label to win (on the die that rolled a 1 or 2, respectively). The second game resulted in 4 dice rolled with a sum of 11, which is 4 more than the desired sum of 7. The only way to win the second game is to use the 1 label, which does not interfere with the first game. As a result, both games are winnable. 

**Author: Teagan Gao**
