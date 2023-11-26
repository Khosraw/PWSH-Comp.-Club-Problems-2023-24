import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine()); 

        List<int[]> carrots = new ArrayList<>();
        for (int i = 0; i < C; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            
            carrots.add(new int[]{x, y});
        }

        Collections.sort(carrots, Comparator.comparingInt(a -> a[0] * N + a[1]));

        out.println(canRabbitEatAllCarrots(N, carrots) ? "Yes" : "No");

        out.flush();
        out.close();
    }

    private static boolean canRabbitEatAllCarrots(int N, List<int[]> carrots) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(1);
        while (fib.get(fib.size() - 1) <= 2 * N) {
            fib.add(fib.get(fib.size() - 1) + fib.get(fib.size() - 2));
        }

        int x = 0, y = 0, stepIndex = 0;

        for (int[] carrot : carrots) {
            int carrotX = carrot[0];
            int carrotY = carrot[1];

            while ((x != carrotX || y != carrotY) && stepIndex < fib.size()) {
                int step = fib.get(stepIndex);

                if (x + step <= carrotX && x + step <= N - 1)
                    x += step;
                else if (y + step <= carrotY && y + step <= N - 1)
                    y += step;
                else
                    return false;


                stepIndex++;
            }

            stepIndex = 0;
        }

        return true;
    }
}
