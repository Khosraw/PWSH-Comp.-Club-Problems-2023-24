# Diplomatic Timing

In the game Diplomacy, players play as countries fighting each other in a global war. $N$ players are playing a modified version of the game. Each player starts with some amount of health, possibly not the same as the other players. On each turn, each player must make an attack plan to attack the remaining players, assigning some number of armies to attack each of the other players. Players are allowed to make multiple attack plans each turn; if multiple are made, then only the last plan made will be accepted as the player's attack plan. The turn ends when each player that is still alive has made an attack plan for that turn. Then, simultaneously, each player's health is reduced by the total number of armies that attacked them that turn. Any player who has their health released to 0 or lower is considered dead. The game starts on turn 1. Given a log of each attack plan made by players in a game of Diplomacy, can you find out which turn the game is currently on? 

### Input Format

The first line of input contains $N$ and $P$, the number of players and the number of action plans made, respectively. 

Then, $N$ lines follow. Each line will contain a string containing the name of a player and the starting amount of health that player has. 

Then, $P$ lines follow. Each line will begin with a string representing the name of a player and $O$, the total number of other players that they will attack. $2O$ tokens will then follow, with the $(2i - 1)$-th token representing the name of the $i$-th player attacked and the $(2i)$-th token representing the number of armies sent to attack the $i$-th player.

### Output Format

A single line containing a single integer, the number of the current turn. 