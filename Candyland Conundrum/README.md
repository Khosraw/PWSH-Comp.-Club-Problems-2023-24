# Candyland Conundrum

In a modified game of Candyland, the board is made up of an infinite board
of spaces, each colored with one of $N$ colors: $C_1$, $C_2$, $\dots$, 
$C_n$. The squares of the board game are numbered conveniently $0$, $1$, 
$2$, $\dots$. The board you are playing on has the special property that the 
color of square $i$ is $C_k$, where $k$ is the remainder when $i$ is divided 
by $N$. On a player's turn, they roll a die with $N$ faces numbered from $1$ 
to $N$, and move forward $N$ spaces.

There is an interesting twist to this game of Candyland: If the first $N$
spaces a player lands on all have different colors (not including the 
square they start on), then they get a *candelicious* combo and score points
equal to the $N$-th space they landed on. Being the board game connoisseur
you are, you wonder what the total number of points you would earn would be 
if you got every candelicious combo possible. (Two candelicious combos are
considered different if the sequence of squares you land on to get the combo
differ in at least one place.)

**Possible modification to reduce difficulty:** Luckily, your mathematician
friend has already helped you calculate this value. It turns out that the
total sum of points is 
$$N! \cdot \frac{N^2 + 1}{2}.$$

However, this number is quite large, so you want to reduce it modulo $10^9 +
7$. Given $N$, can you compute your reduced sum of canedicious combo points?

## Input Format

The first line of input contains $T$ $(T \leq 1000)$, the number of test cases. 
Then, $T$ lines follow, each containing a value of $N$ $(N \leq 10^5)$. 

## Output Format

$T$ lines, each containing the corresponding reduced candelicious points
for the value of $N$ provided. 

### Sample Input

```
2
2
3
```

### Sample Output

```
5
30
```

### Sample Case Explanation

In the first game, there are two ways to earn a candelicious combo: landing
on square 1 then square 2, or landing on square 2 then square 3. In total,
this earns $2 + 3 = 5$ points. In the second game, there are six ways to 
earn a candelicious combo, with the sequences being 123, 135, 234, 246, 
345, and 357. In total, this earns $3 + 5 + 4 + 6 + 5 + 7 = 30$ points. 



**Author: Aaron Zhou**
