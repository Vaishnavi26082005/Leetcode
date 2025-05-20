class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res= new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        
        dfs(graph,0,temp,res);
        return res;
    }
    public void dfs(int[][]graph, int src,List<Integer>temp,List<List<Integer>>res){
        temp.add(src);
        if(src==graph.length-1){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int a:graph[src]){
                dfs(graph,a,temp,res);
            }
        }
        temp.remove(temp.size()-1);
    }
}