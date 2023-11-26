# Battleship II 

Brian and his friend decide to keep playing Battleship, where each side has $5$ ships $2$, $3$, $3$, $4$, and $5$ units long and $1$ unit wide, but with a twist. 
The missiles they launch hit the $8$ by $8$ board in a $3$ by $3$ square centered at the spot they aim it at. 

Unfortunately, Brian sucks at Battleship (even with all of your help), and he is currently losing. 
However, when his friend isn’t looking, Brian takes a peek at their board. Find the most optimal spot (one that hits the most ship units) to aim his missile at! 

### Input Format

The first line will contain $N$, the number of games played. $N$ groups of $8$ lines forming a $8$ by $8$ grid (with `X` representing the battleship locations and `.` representing the spots with no ship) and an empty line will follow. 

### Constraints

- $0 \leq N \leq 10$
- The friend is guaranteed to have all five battleships still on the board.
- All ships are placed horizontally or vertically.
- Battleships cannot touch one another. 

### Output Format

Output the locations of the most optimal spots to aim at. 
Let the board be represented by a coordinate system (with the first column equal to $1$, second column equal to $2$, etc. and the first row equal to $1$, second row equal to $2$, etc) and a spot on the board be represented by (column, row).  

### Sample Input

```
3 2
XX......
....X...
.X..X..X
.X..X..X
.X..X..X
....X...
XXXX....
........

X.X.X.X.
X.X.X.X.
..X.X.X.
X...X...
X...X...
X.......
X.......
........
```

### Sample Output

```
(2,3) (4,3)
(4,7) (6,7)
```

### Sample Case Explanation 

For the first game, at the spots returned (column $2$, row $3$ and column $4$, row $3$), the missile will hit four spots on the battleships, the most out of all possible locations. 

In the second game, at $\left(4,7 \right)$ and $\left(6,7 \right)$ , the missile will hit five spots on the battleships. 

**By Annie Li**
