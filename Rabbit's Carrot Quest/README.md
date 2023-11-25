# Rabbit's Carrot Quest

In the enchanted land of Fiboria, a clever rabbit finds itself on a magical `N x N` grid. The rabbit has a unique way of moving – it follows the Fibonacci sequence to determine the number of tiles it hops in a single move. The rabbit can move up, down, left, or right, but with each move, it hops a number of tiles equal to the next number in the Fibonacci sequence (1, 1, 2, 3, 5, 8, 13, ...). The rabbit starts its journey from the top-left corner (0, 0) of the grid, with the initial move being 1 tile.

Scattered across the grid are `C` delicious carrots, each located at a specific (x, y) coordinate. When the rabbit eats a carrot, its excitement resets its hopping pattern back to the first Fibonacci number (1 tile per move). However, there's a catch! If a required move would cause the rabbit to hop outside the boundaries of the grid, it will hit an invisible wall and lose the game.

Your task is to determine whether the rabbit can successfully navigate the grid and eat all the carrots without hitting any walls.

### Constraints

- 1 ≤ N ≤ 1000
- 1 ≤ C ≤ 100
- Each carrot's (x, y) position is unique and within the grid bounds.

### Input Format

- The first line contains an integer `N`, the size of the grid.
- The second line contains an integer `C`, the number of carrots.
- The next `C` lines each contain two integers `x` and `y`, representing the position of each carrot.

### Output Format

- Print `Yes` if the rabbit can eat all the carrots without hitting the walls. Otherwise, print `No`.

#### Sample Input 1

```
5
2
0 4
4 4
```

#### Sample Output 1

```
Yes
```

#### Sample Input 2

```
5
3
2 0
2 2
4 3
```

#### Sample Output 2

```
No
```
