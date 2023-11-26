A game of Go starts with an empty board. Each player has an effectively unlimited supply of pieces (called **stones**), one taking the black stones, the other taking white. The main object of the game is to use your stones to form territories by surrounding vacant areas of the board. It is also possible to capture your opponent's stones by completely surrounding them.

Players take turns, placing one of their stones on a vacant point at each turn, with Black playing first. Note that stones are placed on the intersections of the lines rather than in the squares (meaning there are no diagonals, only 4 directions) and once played stones are not moved. However, they may be captured, in which case they are removed from the board, and kept by the capturing player as **prisoners**. 

At the end of the game, the players count one point for each vacant point inside their own territory, and one point for every stone they have captured. The player with the larger total of territory plus prisoners is the winner.

The empty points which are horizontally and vertically adjacent to a stone, or a solidly connected string of stones, are known as **liberties**. An isolated stone or solidly connected string of stones is captured when all of its liberties are occupied by enemy stones. On an empty board, a stone in the middle (not touching any edges of the board) has 4 liberties, while a stone in the corner of the board only has two and a stone on any edge has 3. 

If a stone of one color, let's say white, is surrounded, or has its liberties occupied, by stones of the other color, black, it is taken 'prisoner' and removed from the board. For example, on an empty board with one white stone in the middle (4 liberties), if 4 black stones are placed adjacent to the white stone on either side, the white stone would be removed from play and given to the black stone player, leaving a plus shaped formation with no middle on the board. 

Stones occupying adjacent points constitute a solidly connected **string**. It is important to remember that only stones which are horizontally or vertically adjacent are solidly connected; diagonals do not count as connections. Several strings close together, which belong to the same player, are often described as a group. 

![[image1.jpg]]
In the image above, the two black stones in the top left are not considered strings. There are two 'groups' of stones, one black and one white, in the top right and bottom. 


In terms of capturing, a string of stones is treated as a single unit. Similar to isolated stones, a string of stones is captured when all of its liberties are occupied by enemy stones. 
![[image2.jpg]]
![[image3.jpg]]

In the first image above, the strings have been reduced to just one liberty, labeled **f** and **e**. In the following image, both strings are captured by the enemy piece, where the enemy stone is placed in the empty liberty. 
Players may not self capture, meaning placing a stone into a position where it would have no liberties or form part of a string which would then have no liberties. For example, in the first image above, black cannot place a stone in position **f** as it would cause their string to then be captured. 



![[image4.jpg]]
In the image above, a situation occurs. The black string can only be captured if white were to play stones in both **m** and **n**. However, the first of those moves would be illegal as it would count as self capture. These two separate spaces within a group are known as 'eyes'. Therefore, any string or group of stones that has two or more eyes is permanently safe from capture and is referred to as a live group. 

The game ends when a player believes all of their territories are safe, they cannot gain any more territory, nor reduce their opponent's territory or capture more strings. In this case, the player can pass a stone to their opponent as prisoner. Two consecutive passes ends the game. 


In this problem, you will be given a board of size NxN, as well as the starting positions of pieces on the board. The bottom left of the board is (0, 0). You are also given a set number of stones, n, you may place. Given this board, what are the most optimal coordinates for you to place your stones so that you acquire the most territory? Assume your opponent does not make any move and that you will always be playing as the black stone. If there are multiple options to place stones that would result in the same score, prioritize the placement that would use the most stones. 

Input format:
A single number, N, representing the dimensions of the board. The next line contains 3 numbers, b, w, and n, representing the number of black stones on the board, white stones on the board, and the number of stones you have to place. The next b lines will each contain 2 numbers, the x and y coordinate of the black stone. The next w lines will each contain 2 numbers, the x and y coordinate of the white stone. 

Output format: 
A single number representing the total points acquired followed by n lines, each containing a pair of numbers denoting the position of the stones you place in ascending order of the x value. If a stone serves no purpose on the board, do not place it. Any stones not placed should be outputted as -1 -1. 

Constraints:
3 ≤ N ≤ 100
0 ≤ b, w, ≤ N
1 ≤ n ≤ 100

Sample Input:
9
0 3 8
2 0
3 6
8 0

Sample Output:
4
-1 -1
1 0
2 1
2 6
3 0
3 5
3 7
4 6

Explanation:
![[image5.jpg]]
In this scenario, the white stones are positioned as shown, and the **x**'s represent meaningful positions where black stones could be placed. In this situation, the most optimal placement that would also use the most stones would be to surround the white stone in the top middle and the white stone on the bottom left. You would have 2 white stones taken prisoner and 2 spaces inside your stones, adding up to a total score of 4. 



Credits for the images:
 “How to Play.” _British Go Association_, www.britgo.org/intro/intro2.html. Accessed 26 Nov. 2023.