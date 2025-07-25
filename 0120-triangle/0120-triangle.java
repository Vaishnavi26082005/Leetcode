class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();
        int dp[][]= new int[n][n];
        for(int j=n-1;j>=0;j--){
            dp[n-1][j]=arr.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                dp[i][j]=arr.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}