class Solution {
    public int numTilePossibilities(String tiles) {
       HashSet<String>set= new HashSet<>();
       boolean use[]= new boolean[tiles.length()];
       help(tiles,use,set,"");
       return set.size()-1;
        
    }
    public void help(String s,boolean use[],HashSet<String>set,String ans){
      if(set.contains(ans))return;
      set.add(ans);

      for(int i=0;i<s.length();i++){
        if(use[i])continue;
        use[i]=true;
        help(s,use,set,ans+s.charAt(i));
        use[i]=false;
      }
        
    }
}