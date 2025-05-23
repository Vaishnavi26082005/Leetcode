class Solution {
    public void dfs(List<List<Integer>> adj ,int src,boolean[] visi){
        visi[src]=true;
        for(int s:adj.get(src)){
            if(!visi[s]){
                dfs(adj,s,visi);
            }
        }
    }

    public boolean issame(String s1,String s2){
            int dif=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))dif++;
        }
        return dif==2||dif==0;
    }
    public int numSimilarGroups(String[] str) {
       int n=str.length;
       List<List<Integer>> adj= new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       } 

       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(issame(str[i],str[j])){
                adj.get(i).add(j);
                adj.get(j).add(i);
            }
        }
       }
boolean[] visi= new boolean[n];
int c=0;
       for(int i=0;i<n;i++){
    if(!visi[i]){   
        c++;
        dfs(adj,i,visi);
       }}
       return c;
    }
}