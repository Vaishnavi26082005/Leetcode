class Solution {
    public int minimizeMax(int[] nums, int p) {
     Arrays.sort(nums);
      int l=0;
      int r=nums.length-1;
      r=nums[r]-nums[l];
      int res=0;
      while(l<=r){
        int mid=l+(r-l)/2;
        if(isValid(mid,p,nums)){
              res=mid;
              r=mid-1;  
        }
        else{
            l=mid+1;
        }


      }  
      return res;
    }
    public boolean isValid(int mid,int p,int nums[]){
        int c=0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i]<=mid){
                c++;
                i+=2;
            }
            else{
                i++;
            }

        }
        return c>=p;
    }
}