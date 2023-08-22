# Knight's Cryptographic Quest

The Knights have been entrusted with a new cryptographic quest. They are provided with a string $S$ composed of lowercase English letters. The length of the string, denoted as $N$ ($N \leq 10^6$), is a crucial parameter in this adventure. The Knights are also supposed to perform $Q$ operations ($Q \leq 10^5$). Each operation falls into one of the following categories:

1. "UPDATE l r c" - Update the characters from the $l$-th to the $r$-th position (inclusive) of the string $S$ to be the character $c$.
2. "GET l r" - Get the sum of the values of the characters in the string $S$ from the $l$-th to the $r$-th position (inclusive), considering 'a' has a value of 1, 'b' of 2, and so on.
   
Your challenge is to simulate these operations and compute the output of the GET operations.

## Input Format:

The first line of the input includes the string $S$. The second line consists of the integer $Q$. The next $Q$ lines each contain an operation in the format mentioned above.

## Output Format:

For each "GET l r" operation, output a single line containing the sum of the values of the characters from the $l$-th to the $r$-th position in string $S$.
