class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int m=amount+1;
        int [][]dp= new int[m][n];
       for(int a[]:dp){
        Arrays.fill(a,-1);
       }
        return ch(amount,coins,0,dp);
        
    }
    public int ch(int amount,int[] coins,int idx,int[][]dp){
        if(idx==coins.length){
         return 0;
        }
        if(amount==0){
             return 1;
        }
        int inc=0;
        int exc=0;
        if(dp[amount][idx]!=-1)return dp[amount][idx];
        if(coins[idx]<=amount){
        inc=ch(amount-coins[idx],coins,idx,dp);
        }

        exc=ch(amount,coins,idx+1,dp);
        return dp[amount][idx]=inc+exc;
    }
}