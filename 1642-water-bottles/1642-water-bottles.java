class Solution {
    public int numWaterBottles(int n, int ex) {
      return n+solve(n,ex);
    }
    public int solve(int n,int ex){
          if(n<ex)return 0;
           int re=n/ex;
          return re+ solve(re+n%ex,ex);
    }
}