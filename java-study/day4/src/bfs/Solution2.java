package bfs;

public class Solution2 {
    int[][] move ={{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int solve(int[][] map) {
        stacktest(0, 5);
        return 0;
    }

    public int stacktest(int count, int last) {
        if (count == last) return 100;
        return stacktest(count + 1, last);

    }
}
