import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(), C = scanner.nextInt();
        int[][] carrots = new int[C][2];
        for (int i = 0; i < C; i++) {
            carrots[i][0] = scanner.nextInt();
            carrots[i][1] = scanner.nextInt();
        }
        
        Arrays.sort(carrots, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[0], b[0]);
            }
        });

        if (canEatAllCarrots(N, C, carrots)) System.out.println("Yes");
        else System.out.println("No");
    }

    private static boolean canEatAllCarrots(int N, int C, int[][] carrots) {
        Set<Integer> prefixSums = generateFibonacciPrefixSums(2 * N);

        int x = 0, y = 0;
        for (int[] carrot : carrots) {
            int rightSteps = carrot[1] - y; 
            int downSteps = carrot[0] - x;

         if (rightSteps < 0 || downSteps < 0 || !prefixSums.contains(rightSteps) || !prefixSums.contains(downSteps))
            return false;

            x = carrot[0];
            y = carrot[1];
        }
        return true;
    }
    
    private static Set<Integer> generateFibonacciPrefixSums(int maxSum) {
        Set<Integer> prefixSums = new HashSet<>();
        List<Integer> fib = new ArrayList<>();
        int nextFib;
    
        fib.add(1);
        fib.add(1);
        prefixSums.add(1); 
        int currentSum = 2;
    
        while (currentSum <= maxSum) {
            nextFib = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
            fib.add(nextFib);
            currentSum += nextFib;
            prefixSums.add(currentSum);
        }
    
        if (currentSum > maxSum) {
            fib.remove(fib.size() - 1);
            currentSum -= nextFib;
            prefixSums.remove(currentSum);
        }

        return prefixSums;
    }
}
