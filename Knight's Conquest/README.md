# Knight's Conquest

A knight in chess moves by going two squares in one direction, and then one square in a perpendicular direction (forming an L or J shape). Horsey is on an $M \times N$ chessboard and needs to visit his friend Jorsey! However, some squares are unvisitable. Determine the minimum number of moves a knight needs to reach a certain square.

## Input Format:

The first line of input will consist of two integers $M, N$ $(1 \leq M, N \leq 5000)$, representing the size of the chessboard.

The next $M$ lines of input will contain $N$ space-separated characters each, with the following notations:
. = visitable square
X = non-visitable square
A = Horsey's start square
B = Jorsey's (end) square

## Output Format:

The output will consist of a single integer, representing the minimum number of moves required for Horsey to reach Jorsey, or "IMPOSSIBLE" if he cannot do it.

##Sample Input 1:
4 5
. . X . X
. X . . .
. . A B .
. X . . .

##Sample Output 1:
IMPOSSIBLE

##Sample Input 2:
4 5
. . X X X
X X . X X
. A B . .
. . . . .

##Sample Output 2:
5

**Author: Alex Zheng**
