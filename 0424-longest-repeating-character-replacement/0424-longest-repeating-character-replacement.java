class Solution {
    public int characterReplacement(String s, int k) {
      int l=0;
      int r=0;
      int maxlen=0;
      int max=0;
      int freq[]= new int[256];
      while(r<s.length()){
        freq[s.charAt(r)-'A']++;
        max=Math.max(max,freq[s.charAt(r)-'A']);
        int cg=(r-l+1)-max;
        if(cg>k){
            freq[s.charAt(l)-'A']--;
            l++;
        }
        if(cg<=k){
            maxlen=Math.max(maxlen,r-l+1);
        }
    r++;
      }
      return maxlen;
    }
}