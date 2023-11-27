# Pawn's New Game
A pawn has become sick of being undervalued. They have decided to leave the confines of chess entirely and create their own game. In their game, the player is provided with a start word, end word, and a list of valid words. The goal of the player is to change the start word to the end word through a sequence of conversions, while adhering to the following rules:

1.The next word created must differ from the previous word by one letter

2.The word created must be a valid word from the given list

The pawn needs your help creating their game. Can you determine if there is a valid sequence of word conversions from the start to end word?

### Input Format:
The first line of input contains a single integer N, the number of words in the list of valid words. The second line contains N words. The third line contains K, the start word, followed by W, the end word.

### Constraints:

### Output Format:
A single line containing a string either “true” or “false”

### Sample Input:
```
6
home fame play flay glam glad
game play
```
### Sample Output:
true

### Sample Case Explanation:
A conversion sequence from game to play would be: game, fame, flay, play

**By: Emily Lou**
