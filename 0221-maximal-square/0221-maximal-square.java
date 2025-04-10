class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        int max=0;
       

         for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(matrix[i][j]!='0'){
               if(i==n-1||j==m-1){dp[i][j]=1;
               max=Math.max(dp[i][j],max);}
               else {
                dp[i][j]=Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]))+1;
                max=Math.max(dp[i][j],max);
               }}
            }
        }
        return max*max;
    }
}