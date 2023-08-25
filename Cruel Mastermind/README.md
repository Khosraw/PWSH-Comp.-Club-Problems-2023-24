# Cruel Mastermind

In the popular board game Mastermind, two players play: a Guesser and a Mastermind. At the start of the game, the Mastermind picks a sequence of 5 colors from the list Red (R), Orange (O), Yellow (Y), Green (G), Blue (B), and Violet (V), possibly allowing repeats. Then, the Guesser repeatedly guesses sequences of 5 colors; after every guess, the Mastermind responds with two numbers: $A$ and $B$. $A$ will be the number of colors that are in the final sequence that are also in the correct position, while $B$ will be the number of colors that are in the final sequence that are not in the correct sequence. Note that if a color is guessed repeatedly, it will only be counted in the final sequence up to the number of times that it appears. For example, if the correct sequence is VGYYB, and RYYRY is guessed, then the response would be "1 1". A partial transcript of a game of Mastermind has been provided. Currently, it is not possible to determine for certain what the Mastermind's sequence is; however, it is possible to supply a guess such that the Mastermind's response will eliminate all possible sequences except for one. Can you give an example of such a guess?

### Input Format

The first line will contain a single integer $N$, the number of guesses in the game so far.

$N$ lines follow. Each line contains a 5-character string representing a guess, followed by $A$ and $B$ in response to the guess.

### Output Format

A single line containing a guess that will allow the Guesser to determine the correct sequence. 

**Author: Aaron Zhou**
