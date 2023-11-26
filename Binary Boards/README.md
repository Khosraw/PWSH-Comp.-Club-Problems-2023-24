# Binary Boards

After a long night of playing board games, a group of friends get ready to take their respective board games with them and return home. 
However, when they were cleaning up, they discovered that their board games' names had been converted into binary. Please help them return each board game to their rightful owner!

### Input Format

The first line will contain $N$ $\left(N \leq 26 \right)$, the number of friends. The next $N$ lines will each contain a friend's name and the unscrambled name of the board game that belongs to them. 
The next $N$ lines after that will contain the board game number and the converted board game name into binary, separated by a space. 
Each letter of the encrypted board game name will also be separated by a space. 

For the encryption, let $A = 0,~B = 1,~C = 2,\ldots,~Z = 25$. These numbers are in base $10$.

### Constraints
There will be no spaces in between words in the original board game name, and all letters will be capitalized (for example, Game of Life would be written as GAMEOFLIFE). 

### Output Format
Output $N$ lines, each having the friend's name and the corresponding board game number that belongs to them. The name and board game number should have a space separating the two. 
Let the first friend's name be $A$, the second friend's name be $B$, etc. 

### Sample Input 
```
4
A BATTLESHIP
B GAMEOFLIFE
C RISK
D MONOPOLY
1 10001 1000 10010 1010
2 110 0 1100 100 1110 101 1011 1000 101 100
3 1100 1110 1101 1110 1111 1110 1011 11000
4 1 0 10011 10011 1011 100 10010 111 1000 1111
```
### Sample Output
```
A 4
B 2
C 1
D 3
```
### Sample Case Explanation 

For board game number $1$, the binary converts to `17 8 18 10` in base $10$. According to the key ($A = 0,~B = 1,~C = 2,$ etc.), this translates to `R I S K`. 
When put together, the board game name is RISK, which is $C$’s board game. So, board game number $1$ belongs to $C$. 

For board game number $2$, the binary converts to `6 0 12 4 14 5 11 8 5 4` in base $10$, which yields GAMEOFLIFE, the game that belongs to $B$. 

Doing this for the rest of the games reveals Monopoly as board game number $3$ and Battleship as board game number $4$, belonging to $D$ and $A$ respectively. 

**By Annie Li**
