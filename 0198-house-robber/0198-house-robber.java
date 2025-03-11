class Solution {
    public int rob(int[] nums) {
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);
        return bs(nums,nums.length-1,dp);
    }
    public int bs (int[] nums,int i,int []dp){
        if(i==0){
            return dp[i]=nums[0];
        }
        if(i==-1){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        dp[i]=Math.max(nums[i]+bs(nums,i-2,dp),bs(nums,i-1,dp));
        return dp[i];
    }
}