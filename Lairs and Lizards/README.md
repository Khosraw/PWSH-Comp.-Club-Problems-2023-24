# Lairs and Lizards

In the hit game *Lairs and Lizards*, character creation is done on 
a board of $N$ spaces, numbered conveniently from 1 to $N$. 
Each space $i$ has three statistics: power, denoted $P_i$, 
smartness, denoted $S_i$, and funniness $F_i$, each ranging from 0 to 20. 
In order to create a character, two tokens are placed on the board. If 
the tokens are placed on squares $i$ and $j$ with $i \leq j$, then the 
character will have power $\max(P_i, P_{i+1}, \dots, P_j)$ and have 
analogous statistics for smartness and funniness. A character is considered
be *overpowered* if at least two of its three statistics are at least 15.
Given a board, determine the maximum value of $|j-i|$ over all $i$ and $j$
satisfying the condition that a character created from tokens placed on 
squares $i$ and $j$ is not overpowered.

## Input Format
The first line will contain $N$ ($N \leq 5 \cdot 10^4$), the number of 
squares on the board. Then, $N$ lines follow, each detailing the $P_i$, 
$S_i$, and $F_i$ of a square, respectively. 

## Output Format

A single line containing the maximum value of $|j-i|$ over all $i$ and $j$
satisfying the condition that a character created from tokens placed on 
squares $i$ and $j$ is not overpowered.

### Sample Input

To be added later.

### Sample Output

To be added later.

### Sample Case Explanation

**Author: Aaron Zhou**
