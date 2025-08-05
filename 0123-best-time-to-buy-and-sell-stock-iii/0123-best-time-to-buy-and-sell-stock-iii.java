class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
       int dp[][][]= new int[n+1][2][3];
       
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<=1;j++){
            for(int k=1;k<=2;k++){
              if(j==0){
                dp[i][j][k]=Math.max(0+dp[i+1][0][k],-arr[i]+dp[i+1][1][k]);
              }
              else{
                dp[i][j][k]=Math.max(0+dp[i+1][1][k],arr[i]+dp[i+1][0][k-1]);
              }
            }
        }
       }
       return dp[0][0][2];
    }
}