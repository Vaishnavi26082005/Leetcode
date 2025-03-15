class Solution {
    public int minCapability(int[] nums, int k) {
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<start){
                start=nums[i];
            }
            if(nums[i]>end){
                end=nums[i];
            }
        }
        int ans=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(ishelp(mid,nums,k)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
       return ans; 
    }
    public boolean ishelp(int c,int nums[],int k){
        int hr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=c){
                hr++;
                i++;
            }
            if(hr>=k)return true;
        }
        return false;
    }
}