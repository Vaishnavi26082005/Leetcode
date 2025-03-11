class Solution {
    public int rob(int[] nums) {
         if(nums.length==1){
            return nums[0];
        }
        
        
        int n=nums.length;
        
        int j=0;
        int k=0;
       int num1[]=new int[n-1];
       int num2[]=new int[n-1];
       for(int i=0;i<nums.length;i++){
        if(i!=0){
            num1[j]=nums[i];
            j++;

        }
        if(i!=n-1){
            num2[k]=nums[i];
            k++;
        }
       } 
       return Math.max(rob1(num1),rob1(num2));
    }
    public int rob1(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int prev1=Math.max(nums[0],nums[1]);

        int prev2=nums[0];
        int ans=0;
        for(int i=2;i<nums.length;i++){
            ans=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}