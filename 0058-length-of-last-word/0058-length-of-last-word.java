class Solution {
    public int lengthOfLastWord(String s) {
         String arr[]=s.split(" ");
         String n=arr[arr.length-1];
         return n.length();
    }
}