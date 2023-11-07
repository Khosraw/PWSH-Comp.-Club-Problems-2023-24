# Hidden Threat (can replace knight with queen for simpler solution)

Given the squares a knight can attack from on a NxN board, determine the position of the knight. If there is more than one position, print them in order going from top to bottom, left to right, with the top left corner being (0,0). If there is no possible location, print a pair of -1s. 

### Input Format:
A single number N, followed by N lines representing the chessboard. Each of the N lines has N characters, either an ellipse (.) or the letter (K)

### Output Format:
2 numbers on the same line, sepearted by the space, representing the location of the knight in coordinate location where the top left corner is (0, 0)

### Sample Input:
5  
.K.K.  
K...K  
.....  
K...K  
.K.K.  

### Sample Output:  
2 2  

### Sample Input:  
5  
K..K.  
.K...  
.....  
..K.K  
.....  

### Sample Output:  
-1 -1  
