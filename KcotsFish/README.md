### KcotsFish

Warshock loves the game of Reversi, but keeps losing to Nora! He needs your help to create an engine, aptly named KcotsFish, that can cheat for him by playing the best moves each turn.

The rules of Reversi (that need to be known) are as follows:
 - The game is played on an $N \times N$ grid.
 - One player plays white pieces (represented by an O), and the other plays black pieces (represented by an X). The engine will always play as white.
 - Each piece played must be laid adjacent to an opponent's piece so that the opponent's piece or row of pieces is flanked by the new piece and another piece of the player's colour. All of the opponent's pieces between these two pieces are 'captured' and turned over to match the player's colour.
 (Note that a piece can turn over enemy pieces or rows of pieces in more than one direction).

#### Input Format:
The first line of input consists of an integer $N \leq 100$.
The next $N$ lines of input consist of a string $N$ characters long, where a . represents an empty square, an O represents a white piece, and an X represents a black piece.

#### Output Format:
Print out the maximum number of black pieces that can be flipped by placing one white piece on the grid.

### Sample Input:

........

........

.......O

..OOOOXO

..OOXX..

..OXO...

..X.....

........


### Sample Output:
3

### Sample Explanation:
By placing a white piece in the second column of the last (bottom) row, three black pieces in the northeast diagonal direction will be flipped over.

**Author: Alex Zheng**
