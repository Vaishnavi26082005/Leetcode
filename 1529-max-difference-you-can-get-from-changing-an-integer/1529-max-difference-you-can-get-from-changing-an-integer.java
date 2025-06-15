class Solution {
    public int maxDiff(int num) {
        int n = num;
        String s = String.valueOf(num);
        int i=0,j=1;
        while(i<s.length() && s.charAt(i)=='9') i++;
        char ln;
        if(i==s.length()) ln='9';
        else ln=s.charAt(i);
        String ls = s.replace(ln,'9');
        while(j<s.length() && (s.charAt(j)=='0'||s.charAt(j)==s.charAt(0) || s.charAt(j)==s.charAt(j-1))) j++;
        char sn;
        String ss ;
        if(s.charAt(0)!='1' || j==s.length()){
            sn=s.charAt(0);
            ss = s.replace(sn,'1');
        }
        else{
            sn=s.charAt(j);
            ss = s.replace(sn,'0');
        } 

        return Integer.parseInt(ls)-Integer.parseInt(ss);
    }
}