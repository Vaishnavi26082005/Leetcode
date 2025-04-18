class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int c=0;
        int z=0;
        for(char key:map.keySet()){
            if(map.get(key)%2==0){
             c+=map.get(key);
            }
            if(map.get(key)%2==1){
                c+=map.get(key)-1;
                z++;
            }
        }
        return z>0?c+1:c;
    }
}