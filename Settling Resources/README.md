# Settling Resources

In the game *Settlers of Catan*, players fight over a common pool of 5
resources: sheep, wood, brick, wheat, and ore. One way players can do this
is by rolling a die whose result will grant them a specific set of resources.

Randy has obtained a magical die which he can control to help him gain
resources. The die will allow Randy to pick the result that appears on 
its face when rolled.
However, due its magical powers being too powerful for building
materials to handle, the die is unable to produce brick or wood.
Additionally, if rolling the die would cause Randy to hold more than 20 of 
any resource, his civilization becomes too advanced and becomes the Mongols
(which is undesirable for the world at large). Finally, for each result Randy
picks, he must pay a number of knights specific to the result he chose. 

Randy is currently in a game of Settlers of Catan. He needs a specific set 
of resources to build his town; can you help him determine the minimum number
of knights he must sacrifice to gain his resources without forcing his 
citizens to become the Mongols?

## Input Format

The first line of input gives $N$ ($N \leq 2 \cdot 10^3$), the number of faces on the
magical die. Each of the $N$ lines that follow contain 4 space separated
integers, $s_i$, $w_i$, $o_i$, $k_i$, the amount of sheep, wood, and ore produced, respectively,
followed by the number of knights sacrificed when the roll is made. ($s_i, 
w_i, o_i \leq 20$, $k_i \leq 1000$). The last line of input will contain 3 
space-separated integers: $S$, $W$, and $O$, the minimum amount of sheep, wood, and ore, respectively, Randy needs. 

## Output Format

A single line containing the minimum number of knights needed to be 
sacrificed to build the town. If it is not possible to build the town without
holding too many resources, instead print "Oh no, the Mongols!"

### Sample Input

```
2
1 1 2 2
2 3 2 3
7 0 6
```

### Sample Output

```
11
```

### Sample Case Explanation

It can be confirmed the easiest way to acquire the desired resources is to roll the first face once and the second face 3 times, sacrificing
11 knights in total. 

**Author: Aaron Zhou**
