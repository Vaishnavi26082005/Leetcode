class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==0){
                maj=nums[i];
                c++;
            }
            else if(nums[i]==maj){
                c++;
            }
            else{
                c--;
            }
        }
        return maj;
    }
}