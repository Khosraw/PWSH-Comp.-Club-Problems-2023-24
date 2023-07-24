# Spy Mission

The Pawns and Rooks are on a spy mission deep behind enemy lines. The $P$ Pawns and $R$ Rooks are on an $N \times N$ chessboard, where the enemy King is sleeping. It is the Pawns and Rooks' turn to move, but they do not want to check the King and alert his guards. Determine the number of possible moves that will **not** result in a check. The King is guaranteed to not already be in check. Note that pawns are able to promote on the $N^{th}$ rank and advance 2 spaces on the $2^{nd}$ rank.

### Input Format

The first line of input will contain three integers: the size of the chessboard, $N$ $\left(1 \leq N \leq 10^8 \right)$, the number of pawns, $P$ $\left(1 \leq P \leq 10^8 \right)$, and the number of rooks, $R$ $\left(1 \leq R \leq 10^8 \right)$. The second line will contain two integers, indicating the rank $r$ $\left(1 \leq r \leq N \right)$ and file $f$ $\left(1 \leq f \leq N \right)$ of the enemy king. The next $P$ lines will each contain the position of a pawn, and the following $R$ lines after that will each contain the position of a rook, in the same format.

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

In the sample case, the enemy king is at $\left(5, 5 \right)$. The first pawn at $\left(2, 4 \right)$ can advance 1 or 2 spaces, but moving 2 spaces would result in a check, so only 1 move is possible. The second pawn at $\left(3, 6 \right)$ can advance 1 space, but that would result in a check, so no moves are possible. The first rook at $\left(1, 4 \right)$ is stopped from moving on the $4^{th}$ file by the pawn on $\left(2, 4 \right)$, but has 7 possible moves along the rank. The second rook at $\left(6, 6 \right)$ has 14 possible moves, but 2 result in a check. In total, there are 1 + 0 + 7 + 12 = 20 possible moves.