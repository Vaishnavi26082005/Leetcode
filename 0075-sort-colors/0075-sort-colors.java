class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int mid=0;
        int o=nums.length-1;
        while(mid<=o){
            if(nums[mid]==0){
                swap(nums,z,mid);
                mid++;
                z++;
            
            }
            else if(nums[mid]==1){
                mid++;
                
            }
            else{
                swap(nums,mid,o);
                o--;
            }
           
        }
        

    }
        public void swap(int nums[],int mid,int end){
            int temp=nums[mid];
            nums[mid]= nums[end];
            nums[end]=temp;

            
        }
}