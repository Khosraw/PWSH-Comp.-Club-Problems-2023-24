# Unscenic Route

Bob the Bishop detests scenic routes. Instead, he would like to traverse the $N \times N$ chessboard as efficiently as possible by traveling in one straight line. He would still like to get a good look at what's going on around the board, however, so he decides to perform a **simple linear regression** on the $K$ places he would like to see. He also wants to know the minimum eyesight required in order to see every place. Help Bob figure out what line he should follow, and how good his eyesight needs to be.

### Input Format

The first line of input will contain two integers: the size of the chessboard, $N$, and the number of places Bob would like to see, $K$ $\left(1 \leq N, K \leq 10^3 \right)$. The next $K$ lines will each contain two integers, indicating the rank $r$ and file $f$ $\left(1 \leq r, f \leq N \right)$ of a place.

Simple linear regression formulae for y = a + bx: $a = \frac{(\sum y)(\sum x^2) - (\sum x)(\sum xy)}{n \sum x^2 - (\sum x)^2}$, $b = \frac{n \sum xy - (\sum x)(\sum y)}{n \sum x^2 - (\sum x)^2}$

### Output Format

Two lines, with the equation representing the regression line Bob should follow, in the form y = a + bx, and the necessary eyesight, respectively. All decimals should be rounded to **three decimal places**.

### Sample Input

$12$ $4$  
$2$ $3$  
$3$ $6$  
$5$ $5$  
$8$ $12$

### Sample Output

y = 0.500 + 1.333x  
1.300

### Sample Case Explanation

In the sample case, plugging the x and y values into the formula yields the regression line y = 0.500 + 1.333x. The farthest point from this line is at $\left(5, 5 \right)$, which is at a distance of 1.300, so a minimum eyesight of 1.300 is required to see all the points.

**Author: Randy Guo**
