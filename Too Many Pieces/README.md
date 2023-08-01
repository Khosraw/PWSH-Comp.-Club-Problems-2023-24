# Too Many Pieces

Chesster Boarden owns a promotion chess shop, which sells various pieces for pawns to promote to, but he has a problem: he cannot keep inventory of all his pieces!

Chesster has all of his $P$ pieces lined up in a row, numbered 1...$P$. For convenience, they are denoted in standard chess notation:
$Q$ = queen worth 9, $R$ = rook worth 5, $B$ = bishop worth 3, $N$ = knight worth 3.

Chesster's $Q$ customers buy in bulk: They will buy all the pieces in the range $a ... b$.

Your task is to determine how many pieces of each type the customer will buy, and calculate their total cost. Assume each purchase occurs independently, thus, each query is performed assuming no pieces have been bought yet.

### Input Format:

The first line of input contains $P, Q$.

The next line contains a string of length $P$ denoting the order of the pieces in Chesster's shop.

The final Q lines contains space separated integers $a,b$ where $a \leq b$.

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
