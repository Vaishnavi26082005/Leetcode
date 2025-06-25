class Solution {
    public int[] findArray(int[] pref) {
        int n= pref.length;
        int brr[]= new int[n];
        brr[0]=pref[0];
        for(int i=1;i<n;i++){
          brr[i]=pref[i-1]^pref[i];
        }
        return brr;
    }
}