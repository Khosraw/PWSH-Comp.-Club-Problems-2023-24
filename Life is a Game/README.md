# Life is a Game

In mathematics, there is a famous game called Conway's Game of Life. This game takes place on a rectangular grid of cells, where each cell is either alive or dead. The game starts with some cells alive. Then, each second, the following things happen:

* If a cell that is alive has 1 or fewer alive neighbors, then it gets lonely and becomes dead. 
* If a cell that is alive has 4 or more alive neighbors, then overpopulation takes over and the cell dies. 
* If a cell that is dead has exactly 3 alive neighbors, then the cell becomes alive via reproduction. 
* Otherwise, no change occurs to the cell. 

Here, a neighbor is considered to be any of the 8 cells directly adjacent to any given cell. All cell changes occur simultaneously each second. Some scientists modelling the Conway's Game of Life have noticed that the computer they are simulating the game on is faulty, and after each iteration, will cause some alive cells to become dead and some dead cells to become alive. Help the scientists answer some questions about the state of the game at various different points. 

### Input Format

The first line of input contains four integers: $M$, $N$, $B$, and $Q$ respectively. $M$ and $N$ are the width and height of the starting grid, respectively. 

Then, $N$ lines will follow, representing the initial state of the grid, consisting of only ',' and '*' as characters. Each '.' will represent a dead cell and each '#' will represent an alive cell. 

Then, $B$ lines will follow, each containing 3 integers: $t$, $r$, and $c$, each representing a bit flip occurring at time $t$ at row $r$ and column $c$. The top left corner of the grid is considered to be at row 0 and column 0. 

Then, $Q$ lines will follow, each containing 3 integers: $t$, $r$, and $c$, each representing a query asking for the state of the cell in row $r$ and column $c$ at time $t$. 

### Output Format

$Q$ lines, with the $n$-th line being the word "DEAD" if the $n$th query was a dead cell and "ALIVE" if it was alive. 

### Constraints

$M, N, t \leq 100$, $Q, B \leq 10^5$