class Solution {
    public int maxBottlesDrunk(int n, int ex) {
        
      return n+solve(n,ex);
    }
    public int solve(int n,int ex){
         if(ex>n)return 0;
           
          return 1+ solve(n-ex+1,ex+1);
    }
}
   