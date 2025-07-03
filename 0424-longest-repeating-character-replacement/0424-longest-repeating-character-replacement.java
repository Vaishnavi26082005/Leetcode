class Solution {
    public int characterReplacement(String s, int k) {
        int r=0;
        int n=s.length();
        int [] freq= new int [26];
       int mf=0;
       int l=0;
       int ans=0;
        while(r<n){
         char cc=s.charAt(r);
         freq[cc-'A']++;
         mf=Math.max(mf,freq[cc-'A']);

         int cg=(r-l+1)-mf;
         if(cg>k){
            char p=s.charAt(l);
            freq[p-'A']--;
            l++;
         }
         if(cg<=k)
         ans=Math.max(ans,r-l+1);
         r++;
        }
        return ans;
    }
}