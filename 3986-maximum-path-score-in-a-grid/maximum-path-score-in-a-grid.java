class Solution 
{
    public int maxPathScore(int[][] grid, int k) 
    {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][][] dp = new Integer[m][n][k+1];
        int res = helper(grid, m, n, k, 0, 0, dp);
        return res < 0 ? -1 : res;
    }
    public int helper(int[][] grid, int m, int n, int k, int i, int j, Integer[][][] dp) 
    {
        if(i >= m || j >= n) 
           return Integer.MIN_VALUE;
        int cost = grid[i][j] == 0 ? 0 : 1;
        int score = grid[i][j];
        k -= cost;
        if(k < 0) 
           return Integer.MIN_VALUE;

        if(i == m-1 && j == n-1) 
           return score;
        if(dp[i][j][k] != null) 
           return dp[i][j][k];
        int down = helper(grid, m, n, k, i+1, j, dp);
        int right = helper(grid, m, n, k, i, j+1, dp);
        return dp[i][j][k] = score + Math.max(down, right);
    }
}