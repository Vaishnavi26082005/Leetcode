class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
         int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=1;
        int omax=1;
         Arrays.sort(nums); 
         Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0&&1+dp[j]>dp[i]){
                    dp[i]=dp[j]+1;
                    if(dp[i]>omax){
                         omax=dp[i];
                }
                }
            }
            
        }
        ArrayList<Integer>l=new ArrayList<>();
        int prev=-1;
        for(int i=n-1;i>=0;i--){
            if(dp[i]==omax&&(prev%nums[i]==0||prev==-1)){
            l.add(nums[i]);
            omax--;
            prev=nums[i];

        }
        } 
        return l; 
    }
}