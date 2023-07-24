# Intercontinental Ballistic Missile

After the opponent blunders a queen, you suddenly gain the ability to launch an **Intercontinental Ballistic Missile** (ICBM) at the $N \times N$ chessboard. However, you must be careful where you launch the missile, because if any of your own pieces are within the blast zone, you will lose material. For each of the $Q$ given blast zones, calculate the **net point value** of the zone.

### Input Format

The first line of input will contain two integers: the size of the chessboard, $N$ $\left(1 \leq N \leq 10^4 \right)$ and the number of blast zones, $Q$ $\left(1 \leq Q \leq 10^8 \right)$. The next $N$ lines will each contain a string of length $N$, representing a rank of the chess board. The following $Q$ lines after that will each contain four integers, indicating the two corners of the rectangular blast zone: $x$<sub>1</sub>, $y$<sub>1</sub>, $x$<sub>2</sub>, and $y$<sub>2</sub> $\left(1 \leq x_1, y_1, x_2, y_2 \leq N \right)$.

Piece Values: p = 1, n = 3, b = 3, r = 5, q = 9; P = -1, N = -3, B = -3, R = -5, Q = -9. "_" represents an empty square. There will be no kings.

### Output Format

The net point value of each of the $Q$ blast zones on separate lines.

### Sample Input

$3$ $2$  
bnr  
p_P  
NBR  
$1$ $1$ $1$ $3$  
$1$ $1$ $3$ $3$

### Sample Output

$11$  
$0$

### Sample Case Explanation

In the sample case, the $3 \times 3$ chessboard is given as input. The first query, which is the blast zone with corners at $\left(1, 1 \right)$ and $\left(1, 3 \right)$, has a net point value of b + n + r = 3 + 3 + 5 = 11. The second query has a net point value of all the pieces added together, which equals 0.