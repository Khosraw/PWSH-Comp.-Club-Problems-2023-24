### Problem: "Quantum Checkers Challenge"

In the Quantum Checkers Challenge, players are presented with an N x N checkers board. Each cell of the board can be in one of three states: empty (E), black (B), or red (R). The twist in this game is the quantum nature of the moves. Instead of moving pieces traditionally, players perform a "quantum move" that affects the board's state based on certain mathematical rules.

A quantum move is defined as selecting any two rows or two columns of the board and performing one of two operations: 
1. Swap Operation: Swap the contents of the selected rows or columns.
2. Rotate Operation: Rotate the contents of the selected rows or columns 180 degrees clockwise or counterclockwise.

The goal of the game is to reach a board state where all red pieces are in the top half of the board, and all black pieces are in the bottom half. The challenge is to determine the minimum number of quantum moves required to reach the goal state from a given initial board configuration.

#### Input Format:
- The first line contains an integer T, the number of test cases.
- For each test case:
  - The first line contains an integer N, the size of the board.
  - The next N lines each contain a string of N characters, representing the initial state of the board. Each character is either 'E', 'B', or 'R'.

#### Output Format:
For each test case, output a single line containing the minimum number of quantum moves required to reach the goal state. If it is impossible to reach the goal state, output `-1`.

#### Constraints:
- 1 <= T <= 10
- 2 <= N <= 10

**By:** Khosraw Azizi
