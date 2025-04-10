class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
       Integer dp[]=new Integer [arr.length];
       dp[arr.length-1]=0;
       for(int i=n-2;i>=0;i--){
        int steps=arr[i];
        int min=Integer.MAX_VALUE;
        for(int j=1;j<=steps&&i+j<arr.length;j++){
            if(dp[i+j]!=null)
           min=Math.min(min,dp[i+j]);
        }
        if(min!=Integer.MAX_VALUE){
            dp[i]=min+1;
        }
       }
        return dp[0];
    }
}
