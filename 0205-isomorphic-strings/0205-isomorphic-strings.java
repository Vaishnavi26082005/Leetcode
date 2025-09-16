class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map= new HashMap<>();
        HashMap<Character,Character>m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char sh=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)!=sh)return false;
            }
            else{
                map.put(ch,sh);
            }
             if(m.containsKey(sh)){
                if(m.get(sh)!=ch)return false;
            }
            else{
                m.put(sh,ch);
            }


            }
       return true;
    }
}