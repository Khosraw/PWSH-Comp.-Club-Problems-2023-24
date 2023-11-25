### Numbers Game

Ryan wanted to buy a copy of Scrabble, but he got it off of Wish and the tiles are all
wrong! Instead of letter tiles, he gets a set of number tiles instead. Determined to make
this a fun game, he takes out two sets of numbers from 1 to 9. He rearranges one of the sets
to form a sequence of nine numbers, $a_1$, $a_2$, $\dots$, $a_9$. In order for him to score a 
point, he needs to create a 9-digit number $N$ such that for all $i$ from 1 to 9, the first
digits of $N$ are divisible by $a_i$. Given the sequence formed by the first set of tiles, can
you help Ryan score a point?

#### Input Format:

The first line contains $T$, the number of test cases to follow. Then, each of the next $T$ lines
contains a 9-digit number $M$, representing the sequence formed by the first set of tiles. 

#### Output Format:

$T$ lines, each containing a valid sequence that scores Ryan a point, or -1 if no such sequence 
exists. 

### Sample Input:

```
1
123456789
```

### Sample Output:

```
381654729
```

### Sample Case Explanation:
It can be confirmed that 3 is divisible by 1, 38 is divisible by 2, 381 is divisible by 3,
3816 is divisible by 4, etc. Thus, this is a valid sequence. 


#### Constraints:
$T \leq 1000$


**By:** Aaron Zhou
