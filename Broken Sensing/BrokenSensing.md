# Broken Sensing

Treasure has been buried on the chessboard, and all the pieces are scrambling to find it. The Grand Pawn Society (GPS) thinks it has found a way to reliably determine the correct location. The GPS views the chessboard as a large $N \times N$ grid of squares, with rows and columns each labeled from $1$ to $N$. The society has placed four sensors at various different locations around the chessboard. Each sensor is able to calculate the distance from it to the treasure, but not precisely where the treasure is. In order to scope some additional information from each sensor, the GPS has programmed the sensor to use a specialized distance formula. If a sensor is on row $X$ and column $Y$ and the treasure is on row $x$ and column $y$, then the sensor will measure a distance of 
$$D = \sqrt[3]{(x - X)^3 + (y - Y)^3}.$$
However, due to data limitations, the GPS has only been able to get the sum of the four distances produced by each of the sensors, but not the individual distances. Given this limitation, help the GPS determine the location of the treasure. 

## Input Format

The first line of the input will contain $N$ $\left(N \leq 10^5\right)$, the size of the chessboard. The next four lines of the input will contain two space-separated integers, the row and column of each sensor, respectively. The final line will contain $D$, the sum of all distances measured, *truncated* to three decimal places. 

## Output Format

A single line containing two space-separated integers, the row and column, respectively, of the treasure. If multiple such locations exist, output any of them. It is always guaranteed that one such location will exist. 

### Sample Input

$5$

$1$ $1$

$4$ $2$

$2$ $4$

$3$ $5$

$-2.912$

### Sample Output

$2$ $3$

### Sample Case Explanation

The distances of each of the sensors to the provided treasure location are $2.080$, $-1.912$, $-1$, and $-2.080$, respectively. It can be seen that the sum of these are the desired distance, so this is one possible location. 

**Author: Aaron Zhou**
