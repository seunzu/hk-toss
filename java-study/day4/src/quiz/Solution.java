package quiz;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int[] dx = {-1 , 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    public int solve(int[][] map) {
        int n = map.length;
        int m = map[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];

            if (x == n - 1 && y == m - 1) {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, cnt + 1});
                }
            }
        }

        return -1;
    }

}
