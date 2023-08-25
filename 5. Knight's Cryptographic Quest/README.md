# Knight's Cryptographic Quest

In a mythical kingdom, the Knights have embarked on a cryptographic quest. They have received an ancient scroll inscribed with a string $S$ composed of lowercase English letters. The length of the string, represented as $N$ ($N \leq 10^6$), holds the secret to a treasure. The Knights are also required to conduct $Q$ ceremonial rituals ($Q \leq 10^5$). Each ritual can be one of the following:

1. "TRANSFORM l r c" - Replace the characters from the $l$-th to the $r$-th position (inclusive) of the string $S$ with the character $c$.
2. "INVOKE l r" - For the segment of the string $S$ from the $l$-th to the $r$-th position (inclusive), compute the Knight's Score: The product of the values of the characters squared, where 'a' corresponds to 1, 'b' to 2, and so on.

OR

Editors choice:
1. "To TRANSFORM the energy of the cipher, choose your boundaries at positions $l$ and $r$. All letters from the left bound to the right, you must change them to the energy of character $c$."
2. "Once transformed, to harness its true power, INVOKE the energy between positions $l$ and $r$. The Knight's Score shall then be revealed: It is the product of the square values of the characters, where 'a' is the essence of 1, 'b' embodies 2, and so forth."

The Knights believe that finding the correct Knight's Score will lead them to the treasure. Your challenge is to help the Knights simulate these rituals and compute the Knight's Score for each "INVOKE l r" ritual.

## Input Format:

The first line of the input presents the string $S$.

The second line contains the integer $Q$.

The subsequent $Q$ lines each detail a ritual in the format described above.

## Output Format:

For each "INVOKE l r" ritual, produce a single line displaying the Knight's Score for characters from the $l$-th to the $r$-th position in the string $S$.

Note: For the Knight's Score, if the substring is "abc", then the score will be $(1^2) * (2^2) * (3^2)$.

**Author: Khosraw Azizi**
