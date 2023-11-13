# Chessboard Transposition

In an alternate dimension of chess, players are not just limited to moving pieces. They have the power to transpose any 3x3 section of the board. Transposing means switching rows with columns. Given a chessboard's initial configuration and a series of transpositions, you have to determine the board's final configuration.

For the sake of simplicity, only pawns (represented as 'P') from both white and black sides will be present on the board. Empty squares will be represented by '.'.

### Input Format:

- The first line contains a single integer $T$, the number of transpositions.
- The next 8 lines will represent the initial chessboard configuration. Each line will contain 8 characters (either 'P' or '.').
- The next $T$ lines will contain the transposition instructions. Each instruction will be given as two integers $r$ and $c$ ($1 \leq r, c \leq 6$) which represent the top-left corner of the 3x3 section to be transposed.

### Output Format:

- Output the 8x8 chessboard configuration after all transpositions have been performed.

### Constraints:

- 1 ≤ $T$ ≤ 10

### Example:

**Input:**
```
2
PPP.....
PPP.....
PPP.....
........
........
........
........
........
1 2
3 3
```

**Output:**
```
PPPP....
PPPP....
P.......
........
........
........
........
........
```

**Explanation:**

After the first transposition (starting at 1,2):
```
PPPP....
PPPP....
P.......
........
........
........
........
........
```

After the second transposition (starting at 3,3):
```
PPPP....
PPPP....
P.......
........
........
........
........
........
```

The board remains unchanged after the second transposition because the 3x3 section was filled with empty squares. 

**Problem by: Khosraw Azizi**