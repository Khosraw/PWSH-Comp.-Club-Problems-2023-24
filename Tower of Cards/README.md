# Tower of Cards

One layer of a tower of cards consists of N horizontal cards as the base. On top of the base is N triangles, each consisting of two cards leaned against each other. Each layer consists exactly of N - 1 cards from the previous layer. N must equal 1 for the top layer. George wants to create the tallest tower of cards, but his cards are of varying heights. The cards used to make up each layer must be the same height. Help George figure out the max height he can make his tower, assuming the height of the card represents the height of that layer.

## Input Format: 
The first line of input will contain an integer N, the number of cards George has. The next line consists of N integers representing the heights of each card in centimeters.

## Output Format:
A single integer representing the max height George can make his tower. If it is not possible to make a tower the height will be 0.

### Sample Input:
18

10 6 8 7 9 7 6 6 9 8 10 6 6 7 8 6 7 9

### Sample Output:
15

### Sample Case Explanation:
The tallest tower that can be constructed has a base of 6 cards that are each 6 centimeters tall with a layer above of that constructed with 3 cards that are each 9 centimeters tall. Since the height of the card represents the height for that layer, the max height will be 15 centimeters. 

![image](https://github.com/Khosraw/PWSH-Comp.-Club-Problems-2023-24/assets/106769681/d6245b1d-563b-49a3-a332-0a6adb9ee452)

**Author: Emily Lou**
