# Landing On Squares

In a certain strange board game, dice with $N$ ($1 \le N \le 2 \times 10^4$) sides and irregular numbering are used. All dice used in the game are identical. Like in many games, two dice are rolled 
and their sum is the number of squares you move forward by. You have identified $T$ ($1 \le T \le 100$) detrimental squares that you do not want to land on. For each square, can you determine if 
it is possible to land on it on your next turn? 

### Input Format

The first line contains $N$ and $T$.
The next $N$ lines contain the numbers on each dice.
The next $T$ lines contain the number of squares away from you each bad square is.

### Output Format

$T$ lines, containing either "yes" if it is possible to land on the square, or "no" if it is not.

### Sample Input
```
5 4
9
5
10
4
8
11
14
16
23
```
### Sample Output
```
no
yes
yes
no
```


