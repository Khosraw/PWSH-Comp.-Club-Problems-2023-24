# Rabbit's Carrot Quest

In the enchanted land of Fiboria, a clever rabbit finds itself on a magical $N \times N$ grid. The rabbit has a unique way of moving – it follows the Fibonacci sequence to determine the number of tiles it hops in a single move. The rabbit can move down or right, but with each move, it hops a number of tiles equal to the next number in the Fibonacci sequence $(1, 1, 2, 3, 5, 8, 13, ...)$. The rabbit starts its journey from the top-left corner $(0, 0)$ of the grid, with the initial move being 1 tile.

Scattered across the grid are $C$ delicious carrots, each located at a specific $(x, y)$ coordinate. When the rabbit eats a carrot, its excitement resets its hopping pattern back to the first Fibonacci number (1 tile per move). However, there's a catch! If a required move would cause the rabbit to hop outside the boundaries of the grid, it will hit an invisible wall and lose the game.

Your task is to determine whether the rabbit can successfully navigate the grid and eat all the carrots without hitting any walls.

### Constraints

- 1 ≤ N ≤ 1000
- 1 ≤ C ≤ 100
- Each carrot's (x, y) position is unique and within the grid bounds.

### Input Format

- The first line contains an integer $N$, the size of the grid.
- The second line contains an integer $C$, the number of carrots.
- The next $C$ lines each contain two integers $x$ and $y$, representing the position of each carrot.

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

#### Explanation

#### Explanation for Sample Output 1

In the first sample, the grid size is $5 \times 5$ and there are 2 carrots. The carrot positions are at $(0, 4)$ and $(4, 4)$.
- The rabbit starts at $(0, 0)$ and can reach the first carrot at $(0, 4)$ by moving 4 steps down. The Fibonacci sequence for these steps is $1, 1, 2$, totaling 4 steps.
- After eating the first carrot, the rabbit's step count resets.
- Now, the rabbit needs to move right 4 steps to reach the second carrot at $(4, 4)$. Again, the same Fibonacci sequence $1, 1, 2$ can be used to reach the second carrot.
Since the rabbit can reach both carrots without hitting any walls, the output is `Yes`.

#### Explanation for Sample Output 2

In the second sample, the grid size is $5 \times 5$ and there are 3 carrots. The carrot positions are at $(2, 0)$, $(2, 2)$, and $(4, 3)$.
- The rabbit starts at $(0, 0)$ and can reach the first carrot at $(2, 0)$ by moving 2 steps to the right. The Fibonacci sequence for these steps is $1, 1$.
- After eating the first carrot, the rabbit's step count resets.
- To reach the second carrot at $(2, 2)$, the rabbit needs to move 2 steps down. This is possible with the same Fibonacci sequence $(1, 1)$.
- After eating the second carrot, the rabbit's step count resets again.
- Now, the rabbit needs to move 2 steps to the right and 1 step down to reach the third carrot at $(4, 3)$. However, there is no combination of Fibonacci numbers that allows the rabbit to make this specific movement while adhering to the rule of only moving right or down. The required steps would be $1, 1$ right and $1$ down, but after moving $1, 1$ right, the rabbit must move at least 2 steps in any direction, which is not possible in this case.
Thus, the rabbit cannot reach all carrots without hitting a wall, and the output is `No`.
