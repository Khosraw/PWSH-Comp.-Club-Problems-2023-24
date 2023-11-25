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
