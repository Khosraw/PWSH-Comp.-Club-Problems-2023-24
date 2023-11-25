# Too Many Pieces

Chesster Boarden owns a promotion chess shop, which sells various pieces for pawns to promote to, but he has a problem: he cannot keep inventory of all his pieces!

Chesster has all of his $P$ pieces lined up in a row, numbered $1\dots P$. For convenience, they are denoted in standard chess notation:
$Q$ = queen worth 9, $R$ = rook worth 5, $B$ = bishop worth 3, $N$ = knight worth 3.

Chesster's $Q$ customers buy in bulk: They will buy all the pieces in the range $a \dots b$.

Your task is to determine how many pieces of each type the customer will buy, and calculate their total cost. Assume each purchase occurs independently, thus, each query is performed assuming no pieces have been bought yet.

### Input Format:

The first line of input contains $P, Q \leq 10^6$.

The next line contains a string of length $P$ denoting the order of the pieces in Chesster's shop.

The final Q lines contains space separated integers $a,b \leq 10^6$ where $a \leq b$.

### Output Format:

The output should be $Q$ lines, each with single integer representing the total cost of the pieces the customer has bought.

### Sample Input

$7$ $2$

$QBBQNRB$

$1$ $5$

$2$ $3$

### Sample Output

$27$

$6$

### Sample Explanation

For the first subcase, the range 1...5 is the first 5 pieces, which are $QBBQN$ for a sum of $9+3+3+9+3=27$.

For the second subcase, the range 2...3 is $BB$, which has a sum of $3+3=6$.

**Author: Alex Zheng**
