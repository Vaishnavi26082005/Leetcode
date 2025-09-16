class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
       HashMap<Character,Integer>map= new HashMap<>(); 
       HashMap<Character,Integer>m= new HashMap<>(); 
       for(int i =0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);

       }
       for(int i =0;i<t.length();i++){
        char ch=t.charAt(i);
        m.put(ch,m.getOrDefault(ch,0)+1);

       }
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        // char  sh=t.charAt(i);
         if (!map.get(ch).equals(m.get(ch))) return false;
       }

       return true;
       
    }
}