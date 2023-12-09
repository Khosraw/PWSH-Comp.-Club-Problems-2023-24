# Battleship

The game of Battleship is played on four square grids, two for each player. On one grid, players place their ships, which are 
width-1 rectangles and can be placed horizontally or vertically. This grid is hidden from the opponent. The other grid is initially blank. At each 
turn a player must guess a square on the opponent's grid. The opponent must then announce "hit" if that square is on one of their ships, and "miss" otherwise. 
Both players then mark this play: the guesser on their blank grid, and the responder on the grid containing all their ships. Once all squares that a player's ship 
occupies have been marked, the ship is "sunken".

Brian has almost won a game of Battleship, but there is still one ship remaining that he has not sunk. On his guessing grid, he has marked
all of his hits on this ship as "X" and his misses as "O". Help Brian win by calculating the maximum number of guesses he needs to sink this last marked ship if he plays optimally.
For the purposes of this problem, assume that all X's belong to the current ship and hits on already-sunken ships are ignored.

### Input Format
The first line is an integer, $N$ ($1 \le N \le 1000$), denoting the size of the grid.
The next $N$ lines are strings of length $N$. Empty squares are marked `.`, "miss" squares are marked `O`, and "hit" squares are marked `X`.

### Output Format
A single integer, denoting the maximum number of guesses Brian must make with optimal gameplay.

### Constraints
- There is at least one `X` on the grid.
- A valid ship must exist covering the `X`s. 
- The ship has a length of more than 1.

### Sample Input
```
7
..O..O.
...O...
...XOO.
.O.....
....O..
...O...
O......
```
### Sample Output
3

### Sample Explanation
Brian can first guess the third square in the third row. If this is a hit, he knows the ship is horizontal, and at most two more guesses are needed to sink the whole ship. 
If it is a miss, then he knows the ship has to be vertical, and so at most two more guesses can sink the ship there as well.
