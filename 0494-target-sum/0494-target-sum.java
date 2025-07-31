class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int t=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if ((sum - target) < 0 || (sum - target) % 2 != 0) return 0;
        t=(sum-target)/2;
        int dp[][]=new int[n][t+1];
        if(nums[0]==0){
            dp[0][0]=2;
        }
        else{
            dp[0][0]=1;
        }
        if(nums[0]!=0&&nums[0]<=t)dp[0][nums[0]]=1;
        // int dp[][]=new int[n][t+1];
        for(int i=1;i<n;i++){
            for(int j=0;j<=t;j++){
               int nt=dp[i-1][j];
               int take=0;
               if(j>=nums[i]){
                take=dp[i-1][j-nums[i]];
               }
               dp[i][j]=nt+take;
            }
        }
        return dp[n-1][t];
    }
}