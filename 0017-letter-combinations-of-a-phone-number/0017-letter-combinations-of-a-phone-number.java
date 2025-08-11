class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> l=new ArrayList<>();
        possibleWords(digits,"",l);
        return l;
    }

    private static void possibleWords(String s,String ans,ArrayList<String> l) {
        String [] keypad={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(s.length()==0){
            l.add(ans);
            return;
        }
        char cc=s.charAt(0);
        String keys= keypad[cc-'0'];
        for(int i=0;i<keys.length();i++){
        possibleWords(s.substring(1),ans+keys.charAt(i),l);
        }
        
    }
}
