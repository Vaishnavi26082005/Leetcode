class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int n=triangle.size();
    int dp[][]= new int[n][n];
    for(int i=n-1;i>=0;i--){
        dp[n-1][i]=triangle.get(n-1).get(i);
    }

    for(int i=n-2;i>=0;i--){
        //j=i se isliey kyuki utne hi no . jaise phle row me 1 2sri me 2 and so on.
        for(int j=i;j>=0;j--){
          dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
        }
    }
    return dp[0][0];
    }
}