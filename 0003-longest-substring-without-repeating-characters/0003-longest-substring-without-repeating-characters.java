class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ei=0;
        int si=0;
        int freq[]= new int [256];
        int ans=0;
        while(ei<s.length()){
            char ch=s.charAt(ei);
            freq[ch]+=1;
            while(freq[ch]!=1){
                char d=s.charAt(si);
                freq[d]-=1;
                si++;
            }
            ans=Math.max(ei-si+1,ans);
            ei++;
        }
        return ans;
    }
}