class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        int n=nums.length;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[c++]=nums[i];

            }
            i++;
        }
        return c;
    }
}