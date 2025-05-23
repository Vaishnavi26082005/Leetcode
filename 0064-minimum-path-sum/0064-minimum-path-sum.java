class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
              if(i==n-1&&j==m-1){
                dp[i][j]=grid[i][j];
              }
              else if(i==n-1){
                dp[i][j]=grid[i][j]+dp[i][j+1];
              }
              else if(j==m-1){
                dp[i][j]=grid[i][j]+dp[i+1][j];
              }
              else{
                dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+grid[i][j];
              }
            }
        }
        return dp[0][0];
    }
}