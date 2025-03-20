class Solution {
    public int maxRotateFunction(int[] nums) {
        int n= nums.length;
        int f[]=new int[n];
        int s=0;
         f[0]=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            f[0]+=(i*nums[i]);
        }
        int max=f[0];
        for(int k=1;k<n;k++){
            f[k]=f[k-1]+s-n*(nums[n-k]);
            max=Math.max(f[k],max);
        }
        return max;
    }
}