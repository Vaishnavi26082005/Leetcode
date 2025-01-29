class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>l= new ArrayList<>();
        help(n,0,0,"",l);
        return l;
    }
    public static void help(int n,int o,int c,String ans,List<String>l){
        if(o==n&&c==n){
            l.add(ans);
            return ;
        }
        if(o<n){
            help(n,o+1,c,ans+"(",l);
        }
        if(c<o){
            help(n,o,c+1,ans+")",l);
        }
    }
    
}