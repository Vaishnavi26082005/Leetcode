class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int me=nums[0];
        for(int i=1;i<nums.length;i++){
           if(c==0){
            me=nums[i];
            c++;
           }
           else if(nums[i]==me){
           c++;
           }
           else{
            c--;
           }
        }
        return me;
    }
}