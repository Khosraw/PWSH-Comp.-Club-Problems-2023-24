import java.util.Scanner;

public class QueensMeeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), K = scanner.nextInt();

        int[][] queens = new int[K][2];
        for (int i = 0; i < K; i++) {
            queens[i][0] = scanner.nextInt();
            queens[i][1] = scanner.nextInt();
        }

        int[] result = minDistanceToReachAll(queens);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] minDistanceToReachAll(int[][] queens) {
        int minDistance = Integer.MAX_VALUE;
        int[] minDistanceQueen = new int[2];

        for (int[] queen : queens) {
            int totalDistance = 0;
          
            for (int[] otherQueen : queens)
                if (queen != otherQueen)
                    totalDistance += distance(queen, otherQueen);

            if (totalDistance < minDistance) {
                minDistance = totalDistance;
                minDistanceQueen = queen;
            }
        }

        return minDistanceQueen;
    }

    private static int distance(int[] q1, int[] q2) {
        return Math.max(Math.abs(q1[0] - q2[0]), Math.abs(q1[1] - q2[1]));
    }
}
