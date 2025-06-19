class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int minval=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
           
            if(nums[i]-minval>k){
                c++;
                minval=nums[i];
            }
            
        }
return c;
    }
}