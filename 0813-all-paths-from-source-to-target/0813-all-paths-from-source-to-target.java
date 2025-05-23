class Solution {
    public void dfs(int src,List<List<Integer>>ans,List<Integer>curr,int dest,int[][]graph ){
        if(src==dest){
            ans.add(new ArrayList<>(curr));

        }
        for(int n:graph[src]){
            curr.add(n);
            dfs(n,ans,curr,dest,graph);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> ans= new ArrayList<>();
    List<Integer>curr=new ArrayList<>();
    curr.add(0);
    dfs(0,ans,curr,graph.length-1,graph);
    return ans;
    }
}

