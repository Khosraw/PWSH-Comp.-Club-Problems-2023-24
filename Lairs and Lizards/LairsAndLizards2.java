import java.util.*;
import java.io.*;

public class LairsAndLizards2 {

    private static boolean isOverpowered(TreeMap<Integer, Integer> s1, TreeMap<Integer, Integer> s2, TreeMap<Integer, Integer> s3)
    {
        if(s1.isEmpty())
            return false;
        int count = 0;
        if(s1.lastKey() >= 15)
            count++;
        if(s2.lastKey() >= 15)
            count++;
        if(s3.lastKey() >= 15)
            count++;
        return count >= 2;
    }

    private static void dec(TreeMap<Integer, Integer> map, int key)
    {
        if(map.get(key) == 1)
            map.remove(key);
        else
            map.put(key, map.get(key) - 1);
    }

    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new FileReader("lairs_and_lizards.txt"));
        int N = Integer.parseInt(br.readLine());
        int[][] stats = new int[N][3];
        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            stats[i][0] = Integer.parseInt(st.nextToken());
            stats[i][1] = Integer.parseInt(st.nextToken());
            stats[i][2] = Integer.parseInt(st.nextToken());
        }
        int lE = 0; int max = 0;
        TreeMap<Integer, Integer> s1 = new TreeMap<>();
        TreeMap<Integer, Integer> s2 = new TreeMap<>();
        TreeMap<Integer, Integer> s3 = new TreeMap<>();
        for(int hE = 0; hE < N; hE++)
        {
            s1.put(stats[hE][0], s1.getOrDefault(stats[hE][0], 0) + 1);
            s2.put(stats[hE][1], s2.getOrDefault(stats[hE][1], 0) + 1);
            s3.put(stats[hE][2], s3.getOrDefault(stats[hE][2], 0) + 1);
            while(isOverpowered(s1, s2, s3))
            {
                dec(s1, stats[lE][0]);
                dec(s2, stats[lE][1]);
                dec(s3, stats[lE][2]);
                lE++;
            }
            max = Math.max(max, hE - lE + 1);
        }
        System.out.println(max-1);
        long t2 = System.currentTimeMillis();
        System.out.printf("Total time: %dms", t2 - t1);
    }
}