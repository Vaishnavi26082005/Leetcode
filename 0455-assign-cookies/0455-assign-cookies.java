class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
       int m=s.length;
       while(l<m&&r<g.length){
        if(g[r]<=s[l]){
            r=r+1;
        }
        l=l+1;
       }
       return r;
    }
}