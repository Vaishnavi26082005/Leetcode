class Solution {
    public int minOperations(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
           res^=nums[i];
        }
      int diff=res^k;
      return Integer.bitCount(diff);
    }
}