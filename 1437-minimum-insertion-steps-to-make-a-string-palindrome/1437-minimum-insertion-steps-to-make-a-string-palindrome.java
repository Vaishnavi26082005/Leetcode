class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int dp[][]=new int[n+1][n+1];
        StringBuilder z=new StringBuilder(s);
        String m=z.reverse().toString();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(s.charAt(i-1)==m.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
                
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return s.length()-dp[n][n];
    }
}