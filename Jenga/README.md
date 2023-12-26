### Jenga

Jen is the best Jenga player in the world! However, she has just run into her toughest opponent yet, Ga. The two will always take out the maximum number of bricks possible until no more pieces can be removed from the tower!

The rules of their perfect Jenga game are as follows:
 - In each floor/row of the tower, either the middle of three blocks can be pulled out, or the two sides.
 - All removed bricks are "recycled" and placed back on top of the tower.
 - Bricks can only be removed if they are at least 2 rows below the top row of the tower (the highest row with an existing brick).

#### Input Format:
The first line of input consists of an integer $T < 100$, the number of testcases.
For each of T testcases:
  The first line consists of an integer $H < 10^5$, the current height of the tower.
  The next H lines each contain a 3 digit binary integer, where a 1 represents an existing brick and a 0 represents an already pulled-out brick.

#### Output Format:
Print out the maximum number of Jenga pieces that can be pulled before the tower falls, assuming perfect play. The brick that will make the tower fall is not included.

### Sample Input:
1

6

100

111

111

011

101

011

### Sample Output:
8

### Sample Explanation:
Four more bricks can be pulled out from the bottom 4 rows (the 5th row from the bottom cannot be pulled from due to rule #3), and after placing them back on top, the tower will look like this:

110

111

111

010

010

101

010

Two more bricks can now be pulled from the 5th row from the bottom, or 3rd row from the top:
100

111

111

010

010

010

101

010

We can remove two more bricks again:
111

111

010

010

010

010

101

010

Now, no more bricks can be removed, for a total of 4+2+2=8 bricks removed.

**Author: Alex Zheng**
