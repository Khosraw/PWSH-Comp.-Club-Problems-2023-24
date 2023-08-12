# Rook-Man

Rook-Man is a classic game where a rook must move from the top left to the bottom right corner of an $N \times N$ chessboard, collecting points along the way. The rook can only move down and to the right, but it also has $K$ uses of a special ability that allows them to move one square up or the left. Note that when the rook collects the points on a square, the points are not removed from the square. Find the maximum score Rook-Man can earn.

### Input Format

The first line of input will contain two integers: the size of the chessboard, $N$ $\left(1 \leq N \leq 10^2 \right)$ and the number of ability uses, $K$ $\left(1 \leq K \leq 10^2 \right)$. The next $N$ lines will each contain a string of length $N$, representing a rank of the chess board.

Piece Values: p = 1, n = 3, b = 3, r = 5, q = 9. "_" represents an empty square. There will be no other pieces on the board.

### Output Format

The maximum score Rook-Man can earn by taking the optimal path.

### Sample Input

$3$ $1$  
bnr  
p_q  
qrp

### Sample Output

$35$

### Sample Case Explanation

In the sample case, the $3 \times 3$ chessboard is given as input. The optimal path Rook-Man can take is represented by the string RRDUDD, where R, D, and U mean right, down, and up respectively. This path would earn Rook-Man a score of b + n + r + q + r + q + p = 3 + 3 + 5 + 9 + 5 + 9 + 1 = 35.

**Author: Randy Guo**
