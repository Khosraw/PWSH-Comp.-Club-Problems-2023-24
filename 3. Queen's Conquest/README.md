# Queen's Conquest

In a game of chess, the queen is a powerful piece that can move any number of squares along a rank, file, or diagonal. In this problem, you are given an N x N chessboard (N <= 10^5) with a queen placed at the first square (first row and first column). The queen needs to visit K different squares and then return to its starting position.

Your task is to determine the minimum number of moves required for the queen to visit all the specified squares and return to its starting position. Note that a queen is considered to have visited a square only if it lands on it.

## Input Format:

The first line of input will contain two space-separated integers, N and K, representing the size of the chessboard and the number of squares the queen needs to visit, respectively. The next K lines will each contain two space-separated integers, indicating the row and column of a square the queen needs to visit.

## Output Format:

The output should be a single line containing the minimum number of moves required for the queen to visit all the specified squares and return to its starting position.

### Sample Input:

5 3
2 3
5 5
1 5

### Sample Output:

6

### Test Case Explanation

In this sample, the queen can move from (1,1) to (5,5) in one move, then to (1,5) in another move, then to (2,4) in a third move, then to (2,3) in a fourth move, then to (1, 2) in a fifth move, and finally back to (1,1) in a sixth move. Thus, the minimum number of moves is 6.
