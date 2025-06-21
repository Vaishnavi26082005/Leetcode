class Solution {
    public int maxDistance(String s, int k) {
        int e=0;
        int w=0;
        int so=0;
        int n=0;
        int max=0;

      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='E'){
            e++;

        }
        if(s.charAt(i)=='N'){
            n++;
        }
        if(s.charAt(i)=='W'){
            w++;
        }
        if(s.charAt(i)=='S'){
            so++;
        }
      
      int md=Math.abs(n-so)+Math.abs(e-w);
      int waist=i+1-md;
      int extra=0;

      if(md!=s.length()-1){
        extra=Math.min(waist,2*k);
      }
      md=md+extra;
      max=Math.max(md,max);
      }
return max;
    }
}