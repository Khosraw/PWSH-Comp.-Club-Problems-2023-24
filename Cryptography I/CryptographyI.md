# Cryptography I

The Rooks have devised a key generating algorithm that they want you to test. They want to use the Fibonacci numbers to help generate new keys; these are defined by 
$$F_0 = 0$$
$$F_1 = 1$$
$$F_n = F_{n-1} + F_{n-2}.$$
 In this algorithm, when the key generating algorithm is begun, the algorithm will pick a random Fibonacci number and find its remainder when divided by the wanted prime $P$. Then, from that point onwards, the algorithm will simply pick the next term of the Fibonacci sequence and output its remainder when divided by $P$. (So if the first key provided is based on the $N$-th Fibonacci number, the next will be based on the $\left(N+1\right)$-th Fibonacci number.) However, the Rooks suspect that this algorithm is not secure. Can you prove to them that it isn’t? 

## Input Format

The first line of input will contain the wanted prime $P$ $\left(P \leq 10^9 \right)$. The second line of input will contain two keys that have been generated consecutively. There is no constraint on $N$.

## Output Format

A single line containing the next key that would be generated. 

### Sample Input

$7$

$6$ $5$

### Sample Output

$4$

### Sample Case Explanation

In the sample case, the keys were generated with the consecutive Fibonacci numbers of 55 and 89, which leave remainders of 6 and 5, respectively, when divided by 7. The next Fibonacci number in the sequence would be 144, which leaves a remainder of 4 when divided by 7. 

**By:** Aaron Zhou
