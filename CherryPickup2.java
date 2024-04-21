import java.util.*;
class Solution {
    private int[][][] dp;
    private int[][] grid;
    private int N, M;

    public int cherryPickup(int[][] grid) {
        this.grid = grid;
        this.N = grid.length;
        this.M = grid[0].length;
        this.dp = new int[N][M][N];
        for (int[][] layer: dp)
            for (int[] row: layer)
                Arrays.fill(row, -1);
        return Math.max(0, ok(0, M-1, 0));
    }

    private int ok(int c1, int c2, int r) {
        if (r == N) return 0;
        if (dp[c1][c2][r] != -1) return dp[c1][c2][r];

        int ans = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int C1 = c1 + i;
                int C2 = c2 + j;
                if (C1 >= 0 && C1 < M && C2 >= 0 && C2 < M) {
                    ans = Math.max(ans, ok(C1, C2, r + 1));
                }
            }
        }
        if (c1 == c2) ans += grid[r][c1];
        else ans += grid[r][c1] + grid[r][c2];
        return dp[c1][c2][r] = ans;
    }
}
class CherryPickup2{
public static void main(String[] args) {
    Solution solution = new Solution();
    int[][] grid = {
        {0, 1, -1},
        {1, 0, -1},
        {1, 1,  1}
    };
    int result = solution.cherryPickup(grid);
    System.out.println("Maximum number of cherries that both robots can collect is: " + result);
}
}