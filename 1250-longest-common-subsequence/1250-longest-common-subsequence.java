class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]= new int[n][m];
        for(int a[]:dp){
            Arrays.fill(a,-1);

        }
        return solve(n-1,m-1,s,t,dp);
    }
    public int solve(int id1,int id2,String s,String t,int[][]dp){
       if(id1<0||id2<0)return 0; 
       if(dp[id1][id2]!=-1){
        return dp[id1][id2];
       }

       if(s.charAt(id1)==t.charAt(id2)){
        return dp[id1][id2]=1+solve(id1-1,id2-1,s,t,dp);
       }
       else{
         return dp[id1][id2]=Math.max(solve(id1-1,id2,s,t,dp),solve(id1,id2-1,s,t,dp));
       }
    }
}