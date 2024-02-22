# Simultaneous Exhibition Explanation

Note that the number of games Stock Fish has won is a monotonically increasing function with respect to time.
Essentially, this means that if Stock Fish plays games for a longer period of time, he will have won at least as many games as he did before.
This indicates that we can use binary search to quickly figure out the minimal time for which Stock Fish can win at least G games (notice that this minimal time may force him to win more than exactly G games).
