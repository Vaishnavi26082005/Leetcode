class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int t=amount;
        int dp[][]=new int [n][t+1];
        for(int i=0;i<=t;i++){
            if(i%coins[0]==0){
                dp[0][i]=i/coins[0];
            }
            else{
                dp[0][i]=(int)1e9;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=t;j++){
                int nt=dp[i-1][j];
                int take=Integer.MAX_VALUE;
                if(j>=coins[i]){
                    take=1+dp[i][j-coins[i]];
                }
                dp[i][j]=Math.min(nt,take);
            }
        }
        int nas=dp[n-1][t];
        return nas==(int)1e9?-1:dp[n-1][t];
    }
}