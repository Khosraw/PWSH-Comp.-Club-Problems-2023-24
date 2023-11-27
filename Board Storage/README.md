# Board Storage

After an eventful night hosting N ($1 \le N \le 1000$) board games, you now need to pack them all up in your closet. Each board is a square with a given side length. For some reason, you insist on 
storing all your board games stacked vertically on the same plane (perpendicular to the floor), so no board obstructs the view of another board and you quickly know what games you have 
at a glance. Your closet only has a width of W, so side by side boards' combined width cannot exceed W. You would like to minimize the height of your stack of boards, as taller setups are 
more likely to fall over! Help yourself calculate this minimum height. (Ignore physics for the purpose of this problem.)

### Input Format
The first line contains two space-separated integers: N and W.
The next N lines contain one integer each, being the side length of one of the boards.

### Constraints
- W is always greater than or equal to the width of the largest board.

### Sample Input
```
6 10
5
7
9
3
8
3
```

### Output Format
A single integer, denoting the minimum height that an optimal board stack can reach.

### Sample Output
29


