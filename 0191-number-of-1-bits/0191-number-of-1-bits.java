class Solution {
    public int hammingWeight(int n) {
        return count(n);
    }
    public int count (int n){
        int c=0;
        while(n!=0){
        c++;
        n= n&(n-1);
        }
        return c;
    }
}