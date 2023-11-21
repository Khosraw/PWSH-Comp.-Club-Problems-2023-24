### Monopoly Prankster

You are setting up a game of monopoly, and need to give out $1,500 to each player. However, to your horror, your friend, nicknamed "The Frankster", has replaced all the currency with $1 bills! You are not sure if you will be able to count exactly 1500 bills without messing up, but conveniently, The Frankster has given you two measurement devices, which will hold exactly A and B $1 bills respectively.
However, to add to your misery, you find out that any time you place stacks of $1 bills on the table, The Frankster will immediately sweep it all away, ruining your progress! 

These cash holders can only be filled up to their maximum amount, and you can also move all of the cash in one holder into the other holder until that holder is full. Figure out if, with an infinite amount of $1 bills, you can create exactly $1500 dollars and start the game!

#### Input Format:
- The first line contains an integer T, the number of test cases.
- Each of the next T lines contains two integers, A and B, the capacities of the two cash holders.

#### Output Format:
For each test case, output "It's just a prank bro" if you can start the game, and "I HATE YOU FRANKSTER!!!" if it is impossible to create exactly $1500.

### Sample Input:
2
3 5
2000 2500

### Sample Output:
I HATE YOU FRANKSTER!!!
It's just a prank bro

### Sample Explanation:
With cash holders of capacities 3 and 5, you can only create a total of $8 dollars (as any other money will be swept away by The Frankster).
With cash holders of capacities 2000 and 2500, perform the following operations:
Fill the 2000 (2000 0)
Move the 2000 to the 2500 (0 2000)
Fill the 2000 (2000 2000)
Move the just-filled 2000 to the other 2000, until it reaches 2500 - maximum capacity (1500 2500)
Dump out the 2500 (1500 0)
Now you have created exactly $1500!

#### Constraints:
- 1 <= T <= 1000
- 1 <= A,B <= 10^18

**By:** Alex Zheng
