class Solution {
    public int maxProfit(int k, int[] arr) {
        int n=arr.length;
        int dp[][][]= new int[n+1][2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=1;j++){
                for(int l=1;l<=k;l++){
                    if(j==0){

                   dp[i][j][l]=Math.max(0+dp[i+1][0][l],-arr[i]+dp[i+1][1][l]); 
                    }
                    else{dp[i][j][l]=Math.max(0+dp[i+1][1][l],arr[i]+dp[i+1][0][l-1]); }
                }
            }
        }
        return dp[0][0][k];
    }
}