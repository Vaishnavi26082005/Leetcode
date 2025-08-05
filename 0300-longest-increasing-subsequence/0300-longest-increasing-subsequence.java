class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int dp[][]= new int[n+1][n+1];
        int len=0;
        for(int i=n-1;i>=0;i--){
            for(int prev=i-1;prev>=-1;prev--){
                len=0+dp[i+1][prev+1];
                if(prev==-1||arr[i]>arr[prev])
                len=Math.max(len,1+dp[i+1][i+1]);
dp[i][prev+1]=len;
            }
        }
        return dp[0][0];
    }
}