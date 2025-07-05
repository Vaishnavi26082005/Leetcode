class Solution {
    public int jump(int[] nums) {
     int f=0;
     int end=0;
     int jump=0;
     for(int i=0;i<nums.length-1;i++){
        
        f=Math.max(f,i+nums[i]);
         if(i==end){
            jump++;
            end=f;
            if(end==nums.length-1)
            return jump;
         }
     }
     return jump;
    }
}