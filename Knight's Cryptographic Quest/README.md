# Knight's Cryptographic Quest

In a mythical kingdom, the Knights have embarked on a cryptographic quest. They have received an ancient scroll inscribed with a string $S$ composed of lowercase English letters. The length of the string, represented as $N$ ($N \leq 10^6$), holds the secret to a treasure. The Knights are also required to conduct $Q$ ceremonial rituals ($Q \leq 10^5$). Each ritual can be one of the following:

1. "To TRANSFORM the energy of the cipher, choose your boundaries at positions $l$ and $r$ inclusive. All letters from the left bound to the right, you must change them to the energy of character $c$."
2. "Once transformed, to harness its true power, INVOKE the energy between positions $l$ and $r$ inclusive. The Knight's Score shall then be revealed: It is the product of the square values of the characters, where 'a' is the essence of 1, 'b' embodies 2, and so forth."

The Knights believe that finding the correct Knight's Score will lead them to the treasure. Your challenge is to help the Knights simulate these rituals and compute the Knight's Score for each "INVOKE l r" ritual.

## Input Format

The first line of the input presents the string $S$.

The second line contains the integer $Q$.

The subsequent $Q$ lines each detail a ritual in the format described above.

## Output Format

For each "INVOKE l r" ritual, produce a single line displaying the Knight's Score for characters from the $l$-th to the $r$-th position in the string $S$.

Note: For the Knight's Score, if the substring is "abc", then the score will be $(1^2) * (2^2) * (3^2)$.

### Sample Input

```
abcde
2
TRANSFORM 2 4 c
INVOKE 1 3
```

### Sample Output

```
81
```

#### Explanation

The initial string is "abcde". After the first ritual, "TRANSFORM 2 4 c", the string becomes "accce" (characters from 2nd to 4th positions are replaced by 'c'). The second ritual is "INVOKE 1 3", which requires calculating the Knight's Score for the substring "acc".

The Knight's Score for "acc" is calculated as follows:
- 'a' corresponds to 1, so its square is $1^2 = 1$.
- 'c' corresponds to 3, so its square is $3^2 = 9$.
- The product of these squared values for "acc" (a=1, c=3, c=3) is $1 \times 9 \times 9 = 81$.

**Author: Khosraw Azizi**
