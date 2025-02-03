class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int curr=1;
        int longm=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                curr++;
            }
            else{
                longm=Math.max(curr,longm);
                curr=1;
            }
        }
        longm=Math.max(curr,longm);
          curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                curr++;
            }
            else{
                longm=Math.max(curr,longm);
                curr=1;
            }
        }
        longm=Math.max(curr,longm);
       return longm;
    }
}