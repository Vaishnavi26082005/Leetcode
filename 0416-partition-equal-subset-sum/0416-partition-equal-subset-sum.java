class Solution {
    public boolean canPartition(int[] nums) {
        int tar=0;
        for(int i=0;i<nums.length;i++){
            tar+=nums[i];
        }
        if(tar%2==1)  return false;
        tar=tar/2;
        int n= nums.length;
        boolean dp[][]=new boolean [n][tar+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=tar)
        dp[0][nums[0]]=true;
        for(int i=1;i<n;i++){
            for(int j=0;j<=tar;j++){
                boolean pic=false;
                if(j>=nums[i]){
                    pic=dp[i-1][j-nums[i]];
                }
                boolean np=dp[i-1][j];
                dp[i][j]=pic||np;
            }
        }
        return dp[n-1][tar];
    }

}