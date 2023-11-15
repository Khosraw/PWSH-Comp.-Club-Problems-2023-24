# Board Game Sorting

Aaron has been tasked with sorting all the board games in his board game collection.
Since he has a lot of board games, he decides to use a version of Quicksort to sort
his games. In order to do this, Aaron randomly picks a game to use as the pivot,
and puts all games that would come before the pivot alphabetically to the left of 
the pivot and all games that would come after the pivot alphabetically to the right
of the pivot. After performing one step of this algorithm, Aaron realizes he put his 
phone in the board game that he picked as his pivot. Can you help him find his phone?

## Input Format

The first line of the input contains $N$, the number of board games in Aaron's collection. 
The next $N$ lines that follow will each contain the name of a board game, with the $i$-th
entry representing the $i$-th book from the left after one step of the Quicksort algorithm. 

## Output Format

The first line of output should contain $M$, the number of possible pivots. The next $M$
lines should contain each of the possible pivots, sorted in alphabetical order. 

### Sample Input

4

King of Tokyo

Hanabi

Pandemic

Terraforming Mars

### Sample Output

2

Pandemic

Terraforming Mars



### Sample Case Explanation

The only two board games that have all the games to their left be before them alphabetically and all the games to their
right be after them alphabetically are Pandemic and Terraforming Mars, so those are the possible pivots. 

**Author: Aaron Zhou**
