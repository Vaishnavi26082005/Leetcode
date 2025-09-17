class Solution {
    public String shortestCommonSupersequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]= new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                  if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                  }
                  else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                  }
            }
        }
        int i=n;
        int j=m;
        int len=dp[n][m]; 
        StringBuilder sb= new StringBuilder();

        while(i>0&&j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                sb.insert(0,s.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                sb.insert(0,s.charAt(i-1));
                i--;
            }
            else{
                sb.insert(0,t.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            sb.insert(0,s.charAt(i-1));
                i--;
        }
        while(j>0){
            sb.insert(0,t.charAt(j-1));
                j--;
        }
        return sb.toString();
    }
}