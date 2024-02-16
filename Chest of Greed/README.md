Four players are participating in a D&D campaign. After defeating the dragon's challenge, they spy a chest with what they assume to be gold inside. As they get closer, however, they see a goblin squatted next to the chest, seemingly waiting for someone. Approaching the goblin, the players ask what it is waiting for. The goblin then tells them about the chest, which is enchanted to only allow the winner of the chest's game to claim the gold. The game's rules are as follows:  
There are a total of _N_ coins in the chest. Each side takes turns taking a certain number of coins, either 1, 3, or 4. Each side must act and take coins on their turn. The side that takes the last coin (meaning the other side cannot act) wins and gets to take all the gold for their own. It is given that the four players get to go first (they act as one entity, meaing they collectivly choose a certain amount to take). Given the number of coins in the chest, _N_, determine whether the players can win if both sides play optimally. 

Input format:  
A single number _N_ denoting the number of coins in the chest.

Output format:
Print "We're rich!!!" if the players win, print "Catch that goblin!" if the players lose.

Constraints:
1 ≤ _N_ ≤ 1000000

Sample Input:
5

Sample Output:
We're rich!!!

Explanation:
The players take 3 coins, the goblin is forced to take 1, and the players take the last coin.