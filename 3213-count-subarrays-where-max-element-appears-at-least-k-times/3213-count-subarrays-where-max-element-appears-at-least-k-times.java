class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l=0;
        int r=0;
        long max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);

        }
       long maxc=0;
       long c=0;

        while(r<nums.length){
            if(nums[r]==max){
                maxc++;
            }
            while(maxc>=k){
                c+=nums.length-r;
                if(nums[l]==max){
                    maxc--;
                }
                l++;
            }
            r++;
        }
        return c;
    }
}