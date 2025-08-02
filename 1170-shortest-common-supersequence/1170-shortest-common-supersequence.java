class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]= new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
               if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
               }
               else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
               }
            }
        }
  StringBuilder sb= new StringBuilder();
  int i=n;
  int j=m;
  int len=dp[n][m];
  
  while(i>0&&j>0){
  if(s1.charAt(i-1)==s2.charAt(j-1)){
    sb.insert(0,s1.charAt(i-1));
    i--;
    j--;
  }
  else if(dp[i-1][j]>dp[i][j-1]){
    sb.insert(0,s1.charAt(i-1));
    i--;
  }
  else{
    sb.insert(0,s2.charAt(j-1));
    j--;
  }
  }
  while(i>0){
    sb.insert(0,s1.charAt(i-1));
    i--;
  }
  while(j>0){
    sb.insert(0,s2.charAt(j-1));
    j--;
  }
  return sb.toString();
    }
}