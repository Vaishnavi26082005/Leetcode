class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
       int r=nums.length-1;
       int arr[]=new int[r+1];
       for(int i=nums.length-1;i>=0;i--){
        if(Math.abs(nums[l])<Math.abs(nums[r])){
           arr[i]=nums[r];
           r--;
        }
        else{
            arr[i]=nums[l];
            l++;
        }
       }
       for(int i=0;i<nums.length;i++){
        nums[i]=arr[i]*arr[i];
       }
       return nums;
    }
}