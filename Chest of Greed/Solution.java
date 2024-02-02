
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coins = scan.nextInt();
        if(coins == 2 || coins % 7 == 0){
            System.out.println("Catch that goblin!");
        }
        else{
            System.out.println("We're rich!!!");
        }
    }
}