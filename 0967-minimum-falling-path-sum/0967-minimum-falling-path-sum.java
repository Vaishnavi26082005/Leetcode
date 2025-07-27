class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int dp[][]= new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=arr[0][i];

        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=arr[i][j]+dp[i-1][j];
                int l=0;
                if(j-1>=0){
                    l=arr[i][j]+dp[i-1][j-1];

                }
                else{
                    l=(int)Math.pow(10,9);
                }
                int r=0;
                if(j+1<m){
                    r=arr[i][j]+dp[i-1][j+1];
                }
                else{
                    r=(int)Math.pow(10,9);
                }

                dp[i][j]=Math.min(up,Math.min(l,r));
            }
        }
       int min = Integer.MAX_VALUE;
for (int j = 0; j < m; j++) {
    min = Math.min(min, dp[n - 1][j]);
}
return min;
    }
}