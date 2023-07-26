# Spy Mission

The Pawns and Rooks are on a spy mission deep behind enemy lines. The $P$ Pawns and $R$ Rooks are on an $N \times N$ chessboard, where the enemy King is sleeping. It is the Pawns and Rooks' turn to move, but they do not want to check the King and alert his guards. Determine the number of possible moves that will **not** result in a check. The King is guaranteed to not already be in check. Note that pawns are able to promote on the $N$<sup>th</sup> rank and advance 2 spaces on the 2<sup>nd</sup> rank (as long as it is not also the $(N-1)$<sup>th</sup> rank).

### Input Format

The first line of input will contain three integers: the size of the chessboard, $N$, the number of pawns, $P$, and the number of rooks, $R$ $\left(1 \leq N, P, R \leq 10^6 \right)$. The second line will contain two integers, indicating the rank $r$ and file $f$ $\left(1 \leq r, f \leq N \right)$ of the enemy king. The next $P$ lines will each contain the position of a pawn, and the following $R$ lines after that will each contain the position of a rook, in the same format.

### Output Format

A single integer representing the number of possible moves that will not result in a check.

### Sample Input

$8$ $2$ $2$  
$5$ $5$  
$2$ $4$  
$3$ $6$  
$1$ $4$  
$6$ $6$

### Sample Output

$20$

### Sample Case Explanation

In the sample case, the enemy king is at $\left(5, 5 \right)$. The first pawn at $\left(2, 4 \right)$ can advance 1 or 2 spaces, but moving 2 spaces would result in a check, so only 1 move is possible. The second pawn at $\left(3, 6 \right)$ can advance 1 space, but that would result in a check, so no moves are possible. The first rook at $\left(1, 4 \right)$ is stopped from moving on the 4<sup>th</sup> file by the pawn on $\left(2, 4 \right)$, but has 6 possible moves along the rank, excluding 1 that results in a check. The second rook at $\left(6, 6 \right)$ has 14 possible moves, but 2 result in a check. In total, there are 1 + 0 + 6 + 12 = 19 possible moves.
