# Knights' Layer Defense Strategy

The Knights are under attack! The Bishops, having successfully defended against the Knights' onslaught, are now marching towards the Knights' castle. In order to mount a defense, the $K$ Knights have arranged themselves on an $N \times N$ chessboard to protect each other in **layers**, where a knight defending another knight is one layer, and a knight defending a knight defending another knight is two layers of protection. The Knights have also arranged themselves in such a manner as to guarantee **at most one path** between every pair of Knights.  Now, the Knights need to know how many layers of protection they have against the Bishops.

### Input Format

The first line of input will contain two integers: the size of the chessboard, $N$, and the number of knights, $K$ $\left(1 \leq N, K \leq 10^3 \right)$. The next $K$ lines will each contain two integers, indicating the rank $r$ and file $f$ $\left(1 \leq r, f \leq N \right)$ of a knight.

### Output Format

A single integer representing the number of layers of protection of the most protected knight.

### Sample Input

$5$ $5$  
$1$ $1$  
$2$ $3$  
$3$ $2$  
$5$ $3$  
$5$ $5$

### Sample Output

$3$

### Sample Case Explanation

In the sample case, the knight at $\left(1, 1 \right)$ defends, and is defended by, the knights at $\left(2, 3 \right)$ and $\left(3, 2 \right)$; and the knight at $\left(3, 2 \right)$ defends, and is defended by, the knights at $\left(1, 1 \right)$ and $\left(5, 3 \right)$. Thus, the knight at $\left(2, 3 \right)$ has 3 layers of protection through the knights at $\left(1, 1 \right)$, $\left(3, 2 \right)$, and $\left(5, 3 \right)$. The knight at $\left(5, 3 \right)$ similarly has 3 layers of protection. The knight at $\left(5, 5 \right)$ is not defended by anybody and has 0 layers of protection. Therefore, the knight at $\left(2, 3 \right)$ and $\left(5, 3 \right)$ have the most protection, with 3 layers each.

**Author: Randy Guo**
