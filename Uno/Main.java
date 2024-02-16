import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = scan.nextInt();
        scan.nextLine();
        for(int m = 0; m < games; m++){
            String hand = scan.nextLine();
            int cardAmt[] = {5, 5, 5, 5};
            char cards[] = hand.toCharArray();
            int turn = 0;
            boolean reverse = false;
            for(int i = 0; i < cards.length; i++){
                cardAmt[turn]--;
                if(cards[i] == '4'){
                    if(reverse){
                        turn--;
                    }
                    else{
                        turn++;
                    }
                    if(turn > 3){
                        turn = 0;
                    }
                    if(turn < 0){
                        turn = 4+turn;
                    }
                    cardAmt[turn]+=4;
                }
                else if(cards[i] == '0') {
                    if (reverse) {
                        turn--;
                    } else {
                        turn++;
                    }
                }
                else if(cards[i] == 'v'){
                    if(reverse){
                        turn--;
                    }
                    else{
                        turn++;
                    }

                    reverse = !reverse;
                }


                if(reverse){
                    turn--;
                }else{
                    turn++;
                }
                if(turn > 3){
                    turn = turn - 4;
                }
                if(turn < 0){
                    turn = 4+turn;
                }
            }
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            boolean tie = false;
            for (int i = 0; i < cardAmt.length; i++) {
                if(cardAmt[i] >= max){
                    if(cardAmt[i] == max){
                        tie = true;
                    }
                    else{
                        tie = false;
                    }
                    max = cardAmt[i];
                    maxIndex = i;
                }
            }
            if(tie){
                System.out.println("Tie");
                continue;
            }
            switch(maxIndex){
                case 0:
                    System.out.println("Alice");
                    break;
                case 1:
                    System.out.println("Brian");
                    break;
                case 2:
                    System.out.println("Casper");
                    break;
                case 3:
                    System.out.println("Dorothy");
                    break;
            }
        }

    }
}