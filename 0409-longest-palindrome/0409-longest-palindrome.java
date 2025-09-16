class Solution {
    public int longestPalindrome(String s) {
   boolean f=false;
        int ec=0;
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
    
        for(char ch:map.keySet()){
            int a= map.get(ch);
            ec+=(a/2)*2;
            if(a%2==1)f=true;
            
        }
        
        return f==true?ec+1:ec;
    }
}