# Super Pawn

In a game of chess, a pawn can move either one or two spaces on the first turn. However, in Super Chess, a Super Pawn can move either one or two spaces on ANY turn.

A Super Pawn begins on square 1, and needs to reach square 8. Each of the squares 2-7 has a unique integer "value" assigned to them. Note that this "value" may be negative. When a Super Pawn lands on a square, it gains the corresponding "value" of that square.

Your task is to determine the minimum total "value" the Super Pawn can accumulate during its journey. It is guaranteed that there is exactly one minimal value.

### Input Format:

The input will consist of one line of 6 integers, each containing the "value" corresponding with the squares 2-7 in that order.

### Output Format:

The output should be a single integer containing the minimum acculumated "value" by the Super Pawn.

### Sample Input

$1$ $-1$ $1$ $-1$ $1$ $-1$

### Sample Output

$-3$
