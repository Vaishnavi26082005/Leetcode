class Solution {
    public static int res(int[][]arr,int[][]dp){
        int n=arr.length;
        int m=arr[0].length;
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[0][0] = (arr[0][0] == 1) ? 0 : 1; 
                    continue;
                }
                if (arr[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                int up = 0, left = 0;
                if (i > 0) up = dp[i - 1][j];
                if (j > 0) left = dp[i][j - 1];
                dp[i][j] = up + left;
            }
        }
        return dp[n - 1][m - 1];
    }
    public int uniquePathsWithObstacles(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]= new int[n][m];

        
        return res(arr,dp);
    }
}