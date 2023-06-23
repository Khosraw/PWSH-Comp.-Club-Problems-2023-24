# Knight's Cryptographic Quest

The Knights have been entrusted with a new cryptographic quest. They have been given a string $S$ of lowercase English letters of length $N$ ($N \leq 10^6$) and are tasked to perform $Q$ operations ($Q \leq 10^5$). Each operation is of one of the following types:

1. "UPDATE i c" - Update the $i$-th character of the string $S$ to be the character $c$.
2. "GET j" - Get the value of the $j$-th character in the string $S$, assuming 'a' has a value of 1, 'b' of 2, and so on.
Your task is to simulate the operations and produce the output of the GET operations.

## Input Format:

The first line of input contains the string $S$. The second line contains the integer $Q$. The following $Q$ lines each contain an operation in the format described above.

## Output Format:

For each "GET j" operation, output a single line containing the value of the $j$-th character.