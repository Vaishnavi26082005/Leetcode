class Solution {
    public int maxProfit(int[] nums) {
        int min=nums[0];
        int profit=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            profit=Math.max(nums[i]-min,profit);
            min=Math.min(min,nums[i]);
        }
        return profit<0?0:profit;
    }
}