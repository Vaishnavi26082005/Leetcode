class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
      for(int n:nums){
        if(iseven(n))c++;
      }
        return c;
    }
    public boolean iseven(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;

        }
        return c%2==0;
    }
}