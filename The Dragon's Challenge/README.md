Four friends are participating in a session of D&D. After a few hours, they arrive at a dragon's den. Excited at the prospect of treasure and adventure, they head in. After reaching the deepest part of the den, they are greeted by an imposing dragon. They quickly realize they cannot defeat it and are about to die when the dragon proposes a deal. "If you are able to beat my challenge, I will let you go and give you a prize," said the dragon. Left with no choice, the four friends accepted the deal. The challenge is as follows:  
There is a cavern with N entryways. Each entryway leads to a path. The paths may cross, but they never split, meaning there will always be a maximum of N pathways. The objective is to reach the end of the cavern within a given amount of time, T. It is given that there will always be a way to reach the end from any entrance. Each section of the pathway (where a section starts from either an entryway or a intersection and ends either at an intersection or the end of the cavern) has a 'travel time' associated with it, meaning it will take a certain amount of time to travel that path. Given all pathways, intersections, and travel times, is it possible for the group to reach the end of the cavern within the given time?  

Input format:  
Three numbers, N, T and I, separated by a space representing the number of entryways, the maximum time allowed, and the number of intersections. The next I+N lines each hold 4 numbers, the index of the first path, the index of the second path, the travel time for the first path from its previous intersection/entryway to the current intersection, and the travel time for the second path from its previous intersection/entryway to the current intersection. The intersections will be given in the order of which they occur, meaning that the first mention of path 1 means the first section of path 1 extends from the entryway to the current intersection. The last N of the I+N will be the time from the last intersection of each path to the end. The format will be the same, only the second number will be a -1 instead of a path, and so will the 4th number. The 3rd number will represent the time from the last intersection (or entryway) to the end.

Output format:  
Output "Yay we made it in x time!" where x is the shortest time taken if the group is able to reach the end in time. Output "Game over..." if the group is not able to reach the end in time.    

Constraints:  
2 ≤ N ≤ 20  
0 ≤ T ≤ 10000  
0 ≤ I ≤ 100  

Sample Input:  
3 10 2  
1 2 3 5  
1 3 2 6  
1 -1 4 -1  
2 -1 4 -1  
3 -1 2 -1  
  
Sample Output:  
Yay we made it in 7 time!

Explanation:
The shortest path to take to the end is starting at entryway 1, switching to path 2 at the first intersection, and continuing to the end. (3 + 4 = 7)