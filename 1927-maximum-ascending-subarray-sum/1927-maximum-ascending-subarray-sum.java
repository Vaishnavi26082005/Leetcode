class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                System.out.println(nums[i-1]);
                sum+=nums[i];
                 System.out.println("sum"+sum);
            }else{
                max=Math.max(sum,max);
                sum=nums[i];
            
            }
        }
        return Math.max(sum,max);
    }
}