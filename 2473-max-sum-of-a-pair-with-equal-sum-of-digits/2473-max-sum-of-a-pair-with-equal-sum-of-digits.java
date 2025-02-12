class Solution {
    public int maximumSum(int[] nums) {
    int map[]= new int [82];
    int ans=-1;
    for(int num:nums){
        int digis=getDigit(num);
        if(map[digis]>0){
            int prev=map[digis];
            ans=Math.max(prev+num,ans);
            map[digis]=Math.max(prev,num);
        }
        else{
            map[digis]=num;
        }
    }
    return ans;
    }
    public int getDigit(int a){
        int sum=0;
        while(a>0){
         sum+=a%10;
         a=a/10;
        }
        return sum;
    }
}