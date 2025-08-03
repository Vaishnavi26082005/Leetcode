class Solution {
     static boolean isAll(String S1, int i) {
    for (int j = 1; j <= i; j++) {
      if (S1.charAt(j - 1) != '*')
        return false;
    }
    return true;
  }

    public boolean isMatch(String p, String s) {
        int n=s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int i=1;i<=m;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++){
            dp[i][0]=isAll(s,i);
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||s.charAt(i-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    if(s.charAt(i-1)=='*'){
                        dp[i][j]=dp[i-1][j]||dp[i][j-1];

                    }
                    else{
                        dp[i][j]=false;
                    }
                }
            }
        }
        return dp[n][m];
    }
}