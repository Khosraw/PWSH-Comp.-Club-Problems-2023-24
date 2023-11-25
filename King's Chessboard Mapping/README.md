# King's Chessboard Mapping

As the commander of his army, the King needs to keep track of his soldiers' movements on the chessboard for an effective military strategy. The chessboard is an 8x8 grid, and each square is represented by a unique integer. For instance, the square 'A1' corresponds to the integer '1', 'B1' corresponds to '9', and 'H8' corresponds to '64'.

Given N test cases, each containing an integer representing a square on the chessboard, your task is to print the corresponding chess notation for each square.

## Input Format

The first line of input will contain N, the number of test cases. The following N lines will each contain a single integer, representing a square on the chessboard.

## Output Format

The output should consist of N lines. Each line should contain the chess notation corresponding to the integer in the input.

### Sample Input

```
3
1
9
64
```

### Constraints

$1 \leq N \leq 10^3$

### Sample Output

```
A1
B1
H8
```

#### Explanation

- For the integer 1, it corresponds to the first square on the chessboard, which is 'A1'.
- For the integer 9, it corresponds to the first square in the second row, which is 'B1'.
- For the integer 64, it is the last square of the chessboard, which is 'H8'.

#### Code

```py
def chessboard_mapping(num):
    # Rows are represented by letters 'A' to 'H'
    row = chr((num - 1) // 8 + ord('A'))
    # Columns are represented by numbers '1' to '8'
    col = (num - 1) % 8 + 1
    return f"{row}{col}"

# Sample Test Case
N = 3
test_cases = [1, 9, 64]

for num in test_cases:
    print(chessboard_mapping(num))
```

**By:** Khosraw Azizi
