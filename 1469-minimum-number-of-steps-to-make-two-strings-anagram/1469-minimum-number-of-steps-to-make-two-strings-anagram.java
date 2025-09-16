class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer>map= new HashMap<>();
        HashMap<Character,Integer>m= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        int ans=0;
        for (char ch : map.keySet()) {
            int a=map.get(ch);
            int b=m.getOrDefault(ch,0); // ✅ safe now
            ans+=Math.max(a-b,0);
        }
        return ans;
    }
}