import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        char[][] board = new char[m][n];
        int sx = 0, sy = 0, ex = 0, ey = 0;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                board[i][j] = st.nextToken().charAt(0);
                if(board[i][j] == 'H') {
                    sx = i;
                    sy = j;
                } else if(board[i][j] == 'J') {
                    ex = i;
                    ey = j;
                }
            }
        }
        int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[][] dist = new int[m][n];
        for(int i = 0; i < m; i++) Arrays.fill(dist[i], -1);
        Queue<int[]> bfs = new LinkedList<>();
        bfs.add(new int[]{sx, sy});
        dist[sx][sy] = 0;
        while(!bfs.isEmpty()) {
            int[] c = bfs.poll();
            for(int i = 0; i < dx.length; i++) {
                int x = c[0] + dx[i];
                int y = c[1] + dy[i];
                if(x < 0 || x >= m || y < 0 || y >= n || board[x][y] == 'X' || dist[x][y] >= 0) continue;
                dist[x][y] = dist[c[0]][c[1]]+1;
                bfs.add(new int[]{x, y});
                if(board[x][y] == 'J') {
                    bfs.clear();
                    break;
                }
            }
        }
        if(dist[ex][ey] == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(dist[ex][ey]);
        }
    }
}
