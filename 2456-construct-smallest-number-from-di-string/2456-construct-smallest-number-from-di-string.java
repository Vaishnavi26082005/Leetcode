class Solution {
    public String smallestNumber(String pattern) {
      return cs(pattern); 
    }
    public static String cs(String s){
       int c=1;
       int arr[]= new int [s.length()+1];
       Stack<Integer>st= new Stack<>();
       for (int i=0;i<=s.length();i++){
        if(i==s.length()||s.charAt(i)=='I'){
            arr[i]=c;
            c++;
            while(!st.isEmpty()){
                int a= st.pop();
                arr[a]=c;
                c++;
            }
        }
        else{
            st.push(i);
        }
       }
       String str="";
       for(int i=0;i<arr.length;i++){
        str+=arr[i];
       }
       return str;
    }
}