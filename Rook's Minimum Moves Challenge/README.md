# Rook's Minimum Moves Challenge

In a game of chess, a rook can move vertically or horizontally across any number of squares on the board. In this problem, you are given an $N \times N$ chessboard ($N \leq 10^9$) with a rook placed at the first square (first row and first column). The rook needs to visit $K$ ($K \leq 12$) different squares and then return to its starting position.

Note that a rook is considered to have visited a square only if it lands on it. For instance, if a rook moves from the first row and first column to the first row and eighth column, it is not considered to have visited the squares it passed over.

Your task is to determine the minimum number of moves required for the rook to visit all the specified squares and return to its starting position.

## Input Format:

The first line of input will contain two space-separated integers, $N$ and $K$, representing the size of the chessboard and the number of squares the rook needs to visit, respectively. The next $K$ lines will each contain two space-separated integers, indicating the row and column of a square the rook needs to visit.

## Output Format:

The output should be a single line containing the minimum number of moves required for the rook to visit all the specified squares and return to its starting position.

### Sample Input

```
3
1 3
2 2
2 3
```

### Sample Output
```
4
```

### Sample Case Explanation
In this case, the optimal path can seen to be $(1, 1)$ to $(1, 3)$ to $(2, 3)$ to $(2, 2)$ to $(2, 1)$ back to $(1, 1)$. 

**Author: Aaron Zhou**
