class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
       
       List<Integer>l= new ArrayList<>();
       for(int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            l.add(i);
        }
       }
       if(l.isEmpty())return true;
       if(l.size()==2){
        int i=l.get(0);
        int j=l.get(1);
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
       }
    return false;
    }
}