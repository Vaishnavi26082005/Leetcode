class Solution {
    public int maximumDifference(int[] nums) {
      
        int m=nums[0];
        int max=-1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>m){
            max=Math.max(max,nums[i]-m);
            }
            else{
                m=nums[i];
            }
        }

     
        return max;
    }
}