package quiz;

public class Road {
    public static void main(String[] args) {
        //        0,0 출발점 , 4,4 가 도착점
//        1 은 길  0 벽
//        최단 거리
        int[][] map = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
        };
        Solution solution = new Solution();
        int minDistance = solution.solve(map); // 11
        System.out.println(minDistance);
    }
}
