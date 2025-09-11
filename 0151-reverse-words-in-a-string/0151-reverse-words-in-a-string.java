class Solution {
    public String reverseWords(String s) {
       String[]arr= s.split("\\s+");
       String m="";
       for(int i=arr.length-1;i>=0;i--){
        m = m + arr[i] + " ";
       }
       return m.trim();
    }
}