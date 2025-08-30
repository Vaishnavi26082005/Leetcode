class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]= new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1){
                    dp[i][j]=arr[i][j];
                }
                else if(j==0){
                    dp[i][j]=arr[i][j]+Math.min(dp[i+1][j+1],dp[i+1][j]);
                }
                else if(j==m-1){
                    dp[i][j]=arr[i][j]+Math.min(dp[i+1][j-1],dp[i+1][j]);
                }
                
                else {
                    dp[i][j]=arr[i][j]+Math.min(dp[i+1][j+1],Math.min(dp[i+1][j-1],dp[i+1][j]));
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
          min=Math.min(min,dp[0][i]);
        }
        return min;
    }
}