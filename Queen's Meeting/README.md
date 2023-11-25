# Queen's Meeting

In the realm of chess, a meeting of the Queens is about to take place. They are to be arranged on an $N \times N$ grid, which represents the kingdom. You are given the positions of $K$ Queens. Your task is to identify the Queen who can reach all other Queens while covering the shortest total distance. Bear in mind that a Queen can move in any direction: along a rank (horizontal), file (vertical), or diagonal, and can move any number of squares in a single move.

In this context, "covering the shortest total distance" is defined as the sum of the minimal number of squares that a Queen would need to traverse to reach each of the other Queens, using the shortest path possible for each journey. For example, if a Queen needs to move three squares to the right and two squares up to reach another Queen, the total distance is five squares.

## Input Format

The first line of the input will contain two space-separated integers $N$ and $K$ $(1 \leq N, K \leq 10^3)$. These represent the size of the grid and the number of Queens, respectively. The following $K$ lines will each contain two space-separated integers, indicating the row and column of each Queen.

## Output Format

The output should be a single line containing two space-separated integers. These represent the row and column of the Queen who needs to traverse the shortest total distance to reach all the other Queens.

### Sample Input

```
8 3
1 1
4 4
8 8
```

### Sample Output

```
4 4
```

#### Explanation

- The Queen at (4, 4) can reach the Queens at (1, 1) and (8, 8) each with a distance of 3 (moving diagonally), resulting in a total distance of 6.
- The Queens at (1, 1) and (8, 8) would have to cover more distance to reach the other two Queens, so the Queen at (4, 4) is the optimal choice.

**By:** Khosraw Azizi
