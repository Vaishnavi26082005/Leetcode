class Solution {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int c=0;
        int si=-1;
        int ans=Integer.MAX_VALUE;
        HashMap<Character,Integer>map= new HashMap<>();

        for(int i=0;i<t.length();i++){
            char cc=t.charAt(i);
            map.put(cc,map.getOrDefault(cc,0)+1);
        }

        while(r<s.length()){
            char cc=s.charAt(r);
            if(map.containsKey(cc)&&map.get(cc)>0){
                c++;
            }
            map.put(cc,map.getOrDefault(cc,0)-1);
            while(c==t.length()){
              if(ans>r-l+1){
                ans=r-l+1;
                si=l;
              }
               char k=s.charAt(l);
               map.put(k,map.get(k)+1);
               if(map.get(k)>0){
                c--;
               }
               l++;
               
            }
           r++;
        }
        return si==-1?"":s.substring(si,si+ans);
    }
}