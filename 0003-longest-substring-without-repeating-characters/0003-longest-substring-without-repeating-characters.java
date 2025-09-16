class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]= new int [256];
        int l=0;
        int r=0;
        int ans=0;
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch]++;
            while(l<r&&freq[ch]>1){
                char t=s.charAt(l);
                freq[t]--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}