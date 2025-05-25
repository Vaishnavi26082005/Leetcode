class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
       List<List<Integer>>adj= new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }
       for(int a[]:edges){
        int u=a[0];
        int v=a[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
       } 
       int[] res=new int[n];
       dfs(adj,0,-1,labels,res);
       return res;
    }
    public int[] dfs(List<List<Integer>>adj,int node,int parent,String label,int[]res){
        int count[]= new int[26];
        char lab=label.charAt(node);
        count[lab-'a']=1;
        for(int nbr:adj.get(node)){
            if(nbr==parent)continue;
            int []child=dfs(adj,nbr,node,label,res);
            for(int i=0;i<26;i++){
                count[i]+=child[i];
            }
        }
        res[node]=count[lab-'a'];
        return count;
    }


}