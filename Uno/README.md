# Uno

After a long day of work, Alice, Brian, Casper, and Dorothy decide to play a modified version of Uno with only regular, plus fours, skips, and reverse cards. 

To preserve their friendship, the four have decided on a few ground rules: 
- plus four cards adds $4$ cards to the next player and skips that player’s turn.
- plus four cards cannot be played by consecutive players. 
- skip cards skip the next player’s turn.
- reverse cards reverse the turn order, letting the original player who put down the reverse card play another card. 

Each player begins with $5$ cards. Assuming that the turn order always starts off as Alice, Brian, Casper, and then Dorothy, find which of the four have the highest number of cards in their hand at the end of the game. 

### Input Format

The first line will contain an integer $N$ denoting how many games are played. The next $N$ lines contain strings, one per line, that represent the cards played during a game. 
Regular cards are represented by either a “r”, “g”, “b”, or “y”. Plus $4$ cards are represented by a $4$, skip cards are represented by a $0$, and reverse cards are represented by a “v”. 

### Output

Output the name of the player with the most cards at the end of each game played. If there is a tie, output “Tie”. 

### Sample Input
```
1
rr4gggg04v
```

### Sample Output
```
D
```

### Sample Case Explanation: 
For the first game, players Alice and Brian each play a card, bringing their card total down to $4$. Then, Casper plays a plus $4$, adding $4$ cards to Dorothy’s total and skipping her turn. 
The four all play one card, reducing their respective card totals by $1$. Alice then plays a skip, skipping Brian’s turn, and then Casper plays a plus $4$, adding $4$ cards to Dorothy’s hand and skipping her turn. 
Alice plays a reverse card, and the game ends. Tallying up their card totals yields $1$, $3$, $2$, and $12$ for Alice, Brian, Casper, and Dorothy respectively. Therefore, Dorothy is the player with the most cards. 

### Constraints

The strings representing the games are guaranteed to only contain the aforementioned alphanumeric representations and are all valid moves. 

**By: Annie Li**
