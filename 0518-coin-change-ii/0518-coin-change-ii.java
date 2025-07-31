class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int t=amount+1;
        int dp[][]= new int [n][t];
        for(int i=0;i<t;i++){
            if(i%coins[0]==0)
            dp[0][i]=1;
            else dp[0][i]=0;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<t;j++){
                int nt =dp[i-1][j];
                int take=0;
                if(j>=coins[i]){
                    take=dp[i][j-coins[i]];
                }
                dp[i][j]=nt+take;
            }
        }
return dp[n-1][t-1];
    }
}