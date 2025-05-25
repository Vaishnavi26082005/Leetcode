class Solution {
    public char dfs(List<List<Character>>adj ,char ch,boolean[] visi){
        visi[ch-'a']=true;
        char minc=ch;
        for(char nbr:adj.get(ch-'a')){
            if(!visi[nbr-'a']){
                char res=dfs(adj,nbr,visi);
                minc=(char)Math.min(minc,res);
            }
        }
        return minc;
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
      List<List<Character>>adj = new ArrayList<>();
      int n=s1.length();
      for(int i=0;i<26;i++){
        adj.add(new ArrayList<>());

      }
      for(int i=0;i<n;i++){
        char u= s1.charAt(i);
        char v= s2.charAt(i);
        adj.get(u-'a').add(v);
        adj.get(v-'a').add(u);

      }
    StringBuilder res= new StringBuilder();
      for(int i=0;i<baseStr.length();i++){
        char ch=baseStr.charAt(i);
        boolean[] visi=new boolean [26];
        res.append(dfs(adj,ch,visi));
      }
      return res.toString();
    }
}