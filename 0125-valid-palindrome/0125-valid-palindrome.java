class Solution {
    public boolean isPalindrome(String s) {
        String k=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=k.length()-1;
        while(i<=j){
            char c=k.charAt(i);
            char m=k.charAt(j);
            if(c!=m)return false;
            i++;
            j--;
        }
        return true;
    }
}