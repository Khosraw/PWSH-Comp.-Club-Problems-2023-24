import java.util.Scanner;

public class ChessboardTransposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++)
            board[i] = scanner.nextLine().toCharArray();

        for (int t = 0; t < T; t++) {
            int r = scanner.nextInt(), c = scanner.nextInt();
            transposeSection(board, r - 1, c - 1);
        }

        // Output the final chessboard configuration
        for (int i = 0; i < 8; i++)
            System.out.println(new String(board[i]));
    }

    private static void transposeSection(char[][] board, int r, int c) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                // Swap the elements
                char temp = board[r + i][c + j];
                board[r + i][c + j] = board[r + j][c + i];
                board[r + j][c + i] = temp;
            }
        }
    }
}
