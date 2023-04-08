import java.util.Arrays;

public class uniquePathII {
    static int path=0;
    static int[][] dp;
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        return dfs(obstacleGrid,0,0);
    }

    public static int dfs(int[][] grid, int row, int col){
        if(row<0 || col<0 || row==grid.length || col==grid[0].length || grid[row][col]==1){
            return 0;
        }
        if(row==grid.length-1 && col==grid[0].length-1){
            return 1;
        }

        if(dp[row][col]>-1) return dp[row][col];
        return dp[row][col] =  dfs(grid,row+1,col) + dfs(grid,row,col+1);
    }
    public static void main(String[] args) {
        int[][] grid = {{0,1},{0,0}};
        int n = uniquePathsWithObstacles(grid);
        System.out.println(n);
    }
}
