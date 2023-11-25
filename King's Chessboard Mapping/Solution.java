import java.util.Scanner;

public class KingsChessboardMapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            System.out.println(chessboardMapping(num));
        }
    }

    private static String chessboardMapping(int num) {
        char row = (char) ((num - 1) / 8 + 'A');
        int col = (num - 1) % 8 + 1;
        return "" + row + col;
    }
}
