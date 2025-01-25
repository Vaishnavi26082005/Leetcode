class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer,Boolean>map= new HashMap<>();
        List<Integer>safe= new ArrayList<>();
        int n=graph.length;
        for( int i=0;i<n;i++){
           if( help(i,graph,map)){
                safe.add(i);
            }
        }
        return safe;
    }
    public boolean help(int node,int[][] graph,HashMap<Integer,Boolean>map){
        if(map.containsKey(node)){
            return map.get(node);
        }
        map.put(node,false);
        for(int n:graph[node]){
            if(!help(n,graph,map))return false;
        }
     map.put(node,true);
     return true;
    }
}