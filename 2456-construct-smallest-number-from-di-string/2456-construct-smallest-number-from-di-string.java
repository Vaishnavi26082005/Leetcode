class Solution {
    public String smallestNumber(String pattern) {
      return cs(pattern); 
    }
    public static String cs(String s){
        int n= s.length();
        int ans[] =new int[n+1];
        Stack<Integer>st= new Stack<>();
        int c=1;
        for(int i=0;i<=n;i++){
            if(i==n||s.charAt(i)=='I'){
              ans[i]=c;
              c++;
              while(!st.isEmpty()){
                int x=st.pop();
               ans[x]=c;
                c++;
              }
            }
            else{
                st.push(i);
            }
        }
        String str1="";
     for(int i=0;i<n+1;i++){
        str1+=ans[i];
     }
     return str1;
    }
}