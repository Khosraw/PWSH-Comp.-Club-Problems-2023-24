# First Player Fallacy

In every board game, the most important decision of the entire session is choosing the person who will go first. However, the common, boring method of choosing the oldest or tallest players results in unfair advantages that continue throughout a person’s life! To make today’s game night truly equitable, you have been tasked with finding the most average person in the group to have the honor of being the first player. 

### Input Format

The first line will contain a single integer, $N$, denoting the number of players in the group. 
The next $N$ lines will contain the name of the player, followed by a space-separated list of their special traits. Being old, young, tall, and/or short is considered special, and any other traits are considered normal and do not detract from that person’s averageness. If a unique trait shows up in the list more than once, it does not count towards that person’s total more than once.

### Constraints

$1 \leq N \leq 2^{10}$

$0 \leq number of traits \leq 2^{31}-1$

A person will never be both tall and short, or both young and old.

### Output Format

A single line containing the name of the most average person in the group. If there is a tie, output “unknown”. 

### Sample Input 
```
3
Lisa tall longhair biologyfan young tall tall 
Mark shorthair hoodie historynerd likesapples old short
Charlie playsviolin short likesblue wearswatch short
```

### Sample Output
```
Charlie
```

### Sample Case Explanation

Out of the three people given, Lisa is both tall and young, Mark is both old and short, and Charlie is just short. Thus, Charlie is the most average and will go first. 

**Author: Teagan Gao**
