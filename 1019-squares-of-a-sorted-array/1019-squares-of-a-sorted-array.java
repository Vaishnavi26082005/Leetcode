class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int l=0;
        int r=nums.length-1;
        int arr[]=new int[r+1];
        for(int i=r;i>=0;i--){
            if(nums[r]>nums[l]){
                arr[i]=nums[r];
                r--;
            }
            else{
                arr[i]=nums[l];
                l++;
            }
        }
        return arr;
    }
}