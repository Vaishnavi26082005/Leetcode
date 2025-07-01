class Solution {
    public int possibleStringCount(String s) {
        int c=0;
        for(int i=1;i<s.length();i++ ){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
        }
        return c+1;
    }
}