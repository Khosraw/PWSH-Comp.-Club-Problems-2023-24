# Cryptography IV

The Rooks are willing one last time to fight your antics, and they're willing
to do anything to prevent you from breaking their code. This time, they
attempt to use RSA. In RSA, two primes $p$ and $q$ are picked. Then, the
value $N = pq$ is generated, and an exponent $e$ is picked. Now, any
plaintext $a$ can be encrypted to a ciphertext $c$ using the equation 
$$a^e \equiv c \pmod{N}.$$
Now, although RSA is secure in the absence of quantum computing, it fails
if a prime is ever reused. In testing the Rook's new cryptography system, you
notice that this has occurred, where $N_1 = pq$ and $N_2 = pr$ were
generated at two separate instances, with $p$, $q$ and $r$ being primes. From
this, you were able to extract that a plaintext $P$ encrypts to $A$ using
$N_1$ and encrypts to $B$ using $N_2$. You would have tested more, but the
Rooks noticed your intrusion and hacked into your computers, deleting your
records of the values of $N_1$ and $N_2$. 

Out of spite, you wish to defeat the Rooks one last time. You notice on their
server, they are running an authentication service. To pass the
authentication service, the user needs to input a pair of $(x, y)$ such
that 
$$x^e \equiv y \pmod{M},$$
where $M$ is given by the server. However, the Rooks again notice your
attempt to access their authentication, so they attempt to block your
passing. First, to prevent any shenanigans with using too small 
numbers, they enforce that $x^e \geq M$ on the service. Additionally,
to test your skills, they prevent you from accessing $M$, but they do
tell you that $M = qr$, where $q$ and $r$ were the primes generated earlier.
Can you defeat the Rooks one final time and pass their authentication?

### Input Format

The only line of input contains four space-separated integers: $P$, $e$, 
$a$, and $b$. 

### Output Format

A single line containing two space-separated integers: $x$ and $y$, 
respectively. 

### Sample Input

To be added later.

### Sample Output

To be added later. 

### Sample Case Explanation



**Author: Aaron Zhou**
