# Bishops' Alarm Defense Strategy

The Castle of Bishops is under siege by knights. There are $N$ knights ($N \leq 10^5$) outside the castle, each having a unique attack value ($a_1, a_2, \ldots, a_N$). The knights will attack sequentially, in the order they are listed, inflicting damage equal to their respective attack values.

The bishops inside the castle have a unique defense mechanism: an alarm system. This system is represented by a counter that starts at 0. With each knight's attack, the bishops can increase the alarm counter by 1, 2, or 3. If the alarm counter reaches or exceeds 8, the attacking knight's damage is nullified (set to 0), and the alarm counter is reset to 0.

Your task is to help the bishops determine the minimum and maximum total damage that the knights can inflict.

## Input Format:

The first line of input will contain $N$, the number of knights. The second line will contain $N$ space-separated integers, each representing the attack value of a knight.

## Output Format:

The output should consist of two lines. The first line should represent the minimum possible total damage, and the second line should represent the maximum possible total damage.

### Sample Input:

5
2 3 5 6 2

### Sample Output:

12
18

### Sample Case Explanation: 

For the minimum, the bishops can raise the alarm counter by 2 each time, causing the alarm counter to hit 8 when the knight with attack 6 is attacking. This leads to a total damage of 2 + 3 + 5 + 0 + 2 = 12. For the maximum, the bishops can raise the alarm counter by 1 each time, causing the alarm counter to never hit 8 and dealing 2 + 3 + 5 + 6 + 2 = 18 damage to the castle.

**Author: Aaron Zhou**
