# Super Pawn

In a game of chess, a pawn can move either one or two spaces on the first turn. However, in Super Chess, a Super Pawn can move either one or two spaces on ANY turn.

A Super Pawn begins on square 1, and needs to reach square 8. Each of the squares 2-7 has a unique integer "score" assigned to them. Note that this "score" may be negative. When a Super Pawn lands on a square, it gains the corresponding "score" of that square.

Your task is to determine the minimum total "score" the Super Pawn can accumulate during its journey.

### Input Format:

The first line of input will consist of one integer $T \leq 10^4$, the number of testcases.
The next $T$ lines will contain 6 integers $N_1, N_2, ... N_6 \leq 10^6$, each containing the "value" corresponding with the squares 2-7 in that order.

### Output Format:

The output should consist of $T$ lines, each containing a single integer: the minimum acculumated "value" by the Super Pawn.

### Sample Input

$2$
\\$1$ $-1$ $1$ $-1$ $1$ $-1$
\\$-1$ $-1$ $-1$ $-1$ $-1$ $-1$

### Sample Output

$-3$
\\$-6$

### Sample Explanation

In the first testcase, the Super Pawn can take steps of size 2, landing on only the three spaces with values of $-1$. This accumulates a total score of $-3$.

In the second testcase, the Super Pawn can take steps of size 1 all the way through, accumulating a score of $-6$.

**Author: Alex Zheng**

