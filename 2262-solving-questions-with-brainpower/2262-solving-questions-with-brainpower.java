class Solution {
    public long mostPoints(int[][] q) {
      if(q.length==1)return q[0][0];
      long t[]=new long[2000001];
      for(int i=q.length-1;i>=0;i--){
        t[i]=Math.max((q[i][0]+t[i+q[i][1]+1]),t[i+1]);
      }
      return t[0];
    }
}