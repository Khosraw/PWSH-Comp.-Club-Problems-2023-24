# Point Calculations

Madeline is playing a series of games in which she wants to
calculate the number of points she expects to get from all 
the games combined. Each game can be described by two 
numbers, $a_i$ and $b_i$, and the expected number of 
victory points granted by a game with these parameters
is $a_i/(b_i!)$. If $M$ is the expected total number of 
points over all the games combined, help Madeline find the
absolute value of $\log_{10}(M)$, rounded to 3 decimal 
places. 

## Input Format

The first line contains $N$, the number of games Madeline 
wishes to play. Then, $N$ lines follow, each containing
two space-separated integers, $a_i$ and $b_i$ respectively,
detailing the parameters of one game. 

## Constraints
$N \leq 100$, $a_i, b_i \leq 1000$

## Output Format

A single line containing the absolute value of
$\log_{10}(M)$ rounded to 3 decimal places. 

### Sample Input

$2$

$2$ $4$

$3$ $5$

### Sample Output

$0.965$

### Sample Case Explanation

The first game provides a point value of $2/24 = 1/12$ points.
The second game provides a point value of $3/120 = 1/40$
points. In total, both games provide $13/120$ points together,
which has a $\log_{10}$ of $-0.965$.

**Author: Aaron Zhou**
