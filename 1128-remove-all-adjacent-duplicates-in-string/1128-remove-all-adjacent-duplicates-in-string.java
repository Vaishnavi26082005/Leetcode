class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            if(!st.isEmpty()&&cc==st.peek()){
                st.pop();
            }
            else{
                st.push(cc);
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
       return sb.reverse().toString();
    }
}