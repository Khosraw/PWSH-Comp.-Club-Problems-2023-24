Player A is playing Player B in an altered version of the game of Chutes and Ladders. Each time they play, they change the board layout to keep it interesting, with the number of spaces, N, the number of ladders, L, and the number of chutes, C, changing each time. The movement of the game is simple, roll a dice and move the shown number of spaces. If you land on a square with a ladder, you may choose climb up the ladder on your next turn, with the entirety of the ladder counting as once 'space' for the purposes of moving. If you land on a chute, you must follow the chute down to the square it points to. Player B, however, doesn't play fair. The dice that they are using is engineered to give Player B an advantage and Player A a disadvantage. Every time they roll the dice, a preset roll will occur depending on the person rolling, following a specified pattern. Player A always goes first. Given these conditions, determine whether who wins and how many turns it will take (count one action performed by both players to be one turn).

Input:  
Line 1: Three numbers: N, L, and C separated by a space  
Line 2: N numbers separated by spaces, with 0's being a normal space, 1's being a space with a ladder attached (both starting and ending), and 2's being a space with a chute attached (both starting and ending)  
The next L lines will each contain a pair of numbers, the index of the starting space of a ladder and the index of the ending space of a ladder. The index starts at 0.  
The next C lines will each contain a pair of numbers, the index of the starting space of a chute, and the index of the ending space of a chute. The index starts at 0.   
The next line will contain Player A's rolls, each separated by a space. The number of rolls is not given.   
The last line will contain Player B's rolls, each separated by a space. The number of rolls is not given  
Both players start on the 'Start' square, which is before the first space given. 


Output:  
A single character, either A or B to signify who won, followed by a number representing the number of turns it took.   
  
Sample Input:  
10 1 1
0 1 0 0 2 0 0 1 2 0
1 7
8 4
3 4 1 1 6 4 5 1 3
3 6 3 5 4 2 3 3 1

Sample Output:
B 4

Explanation:
On turn one, A and B both end up on index 2. On turn 2, A moves to index 6, while B lands on a chute on index 8 and goes back to index 4. On turn 3, A moves up one step to index 7 and B moves to index 7. On turn 4 A moves to index 8 and lands on a chute, ending up on index 4. B moves 5 spaces and finishes the game. 