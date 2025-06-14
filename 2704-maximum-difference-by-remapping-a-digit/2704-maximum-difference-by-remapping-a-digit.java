class Solution {
    public int minMaxDifference(int num) {
        String str1=Integer.toString(num);
        String str2=str1;
        int idx=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!='9'){
                idx=i;
                break;
            }
        }
        char ch=str1.charAt(idx);
        str1=str1.replace(ch,'9');
        ch=str2.charAt(0);
       str2= str2.replace(ch,'0');

        return Integer.parseInt(str1)-Integer.parseInt(str2);
    }
}