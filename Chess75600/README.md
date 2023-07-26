# Chess75600

Chess960, also known as Fischer random chess, is a chess variant where the starting position of the pieces is randomized with a few constraints: the bishops must be on opposite colors, and the king must be between the rooks. Bored of this variant, some chess pieces have invented a new variant they call Chess75600, where an extra queen and knight are added, and the starting position of the pieces is randomized with no constraints, resulting in 75,600 possible positions. Now, the pieces are bored again and want to convert Chess75600 back into a Chess960-like position (Chess28000), with the knowledge that a swap between two pieces costs the **absolute difference** of their values. Determine the minimum cost required to convert the given Chess75600 position to a Chess28000 position that follows Chess960's constraints.

### Input Format

The first line of input will contain a string of length 10, the starting Chess75600 position.

Piece Values: n = 3, b = 3, r = 5, q = 9, k = 200. There will be exactly 3 n, 2 b, 2 r, 2 q, and 1 k in the position.

### Output Format

A single integer representing the minimum cost required to convert the given Chess75600 position to a valid Chess28000 position.

### Sample Input

qrrnkbnqnb

### Sample Output

$2$

### Sample Case Explanation

In the sample case, the given starting position is invalid because the bishops are not on opposite colors and the king is not in between the rooks. This can be corrected with just 1 swap between the second rook from the left and either of the two bishops, which would cost |r - b| = 5 - 3 = 2.
