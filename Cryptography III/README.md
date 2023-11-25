# Cryptography III

Fed up with the weakness of their previous failed attempts at cryptography, the Rooks turn to cybersecurity experts to figure out how to properly encrypt and send their messages. They end up with one result:

### Diffie-Hellman Key Exchange

The Diffie-Hellman Key Exchange is used to send numbers over a public communication. Let the two people be communicating be Alice and Bob. First, Alice and Bob decide on two numbers over a public channel: $p$ and some number $g$ ($0 \leq g < p$). Then, if Alice has some secret number $a$, then she sends the remainder when $g^a$ is divided by $p$. Bob sends a similar number for his secret number $b$. Then, Alice computes the secret shared number by taking the number Bob sent, say $B$, and computing $B^a$ and finds its remainder when divided by $p$. Similarly, Bob computes $A^b$ and finds its remainder when divided by $p$. These two numbers are always guaranteed to be the same. 

The Rooks now want you to guarantee that their new system is safe. However, in your exploit, you accidentally missed one piece of information: $p$. With the information you have, can you reconstruct the secret number?

### Input Format

A single line containing five space-separated integers: $g$, $a$, $b$, $A$, $B$.

### Output Format

A single line containing the desired secret number. 

### Sample Input
```
5 2 3 12 8
```

### Sample Output
```
12
```

### Sample Case Explanation
In the sample case above, it can be shown that the secret prime chosen was $p = 13$, as $5^2 \equiv 12 \pmod{13}$ and
$5^3 \equiv 8 \pmod{13}$. The secret number is then $12^3 \equiv 12 \pmod{13}$, as outputted. 

### Constraints

It is always guaranteed that a unique $p$ exists. $a, b \leq 10^3$, $p \leq 10^9$. 
