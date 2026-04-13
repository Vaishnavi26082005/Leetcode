class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target){
                min=Math.min(min, Math.abs(i-start));

            }
        }
        for(int i=0;i<start;i++){
            if(nums[i]==target){
                min=Math.min(min, Math.abs(i-start));

            }
        }
    return min;
    }
}