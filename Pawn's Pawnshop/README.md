# Pawn's Pawnshop

A pawn runs a pawnshop (no pun intended). The pawn accepts any items with a value of less than or equal to $N$ and sells them for a value that is twice the value they were bought for. 

Given a list of $K$ items, with their respective values, your task is to determine the maximum profit the pawn can make. If any item is not sold, it does not contribute to the expenses or the profit - it is as if the item was never bought.

## Input Format

The first line of the input will contain two space-separated integers $N$ and $K$ $(1 \leq N, K \leq 10^3)$. The next line will contain $K$ space-separated integers representing the value of each item.

## Output Format

The output should be a single line containing the maximum possible profit the pawn can make, assuming all items bought are sold.

### Sample Input

```
100 5
50 90 120 30 80
```

### Sample Output

```
500
```

#### Explanation

- The pawn can buy items valued at 50, 90, 30, and 80 (since their values are less than or equal to 100).
- The total profit is the sum of these values which are sold at twice their price: 2($50 + $90 + $30 + $80) = $500.
- The item valued at 120 is not bought as its value exceeds $100.

#### Code

```cpp
#include <iostream>
#include <vector>

int max_profit(int N, const std::vector<int>& item_values) {
    int profit = 0;
    for (int value : item_values) {
        if (value <= N) {
            profit += value;
        }
    }
    return profit * 2;
}

int main() {
    int N, K;
    std::cin >> N >> K;
    std::vector<int> item_values(K);

    for (int i = 0; i < K; ++i) {
        std::cin >> item_values[i];
    }

    std::cout << max_profit(N, item_values) << std::endl;
    return 0;
}
```

**Author: Khosraw Azizi**
