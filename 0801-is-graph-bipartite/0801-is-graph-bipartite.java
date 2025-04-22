class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!check(i,color,graph))return false;
            }
        }
        return true;
    }
    public boolean check(int src,int[] color,int graph[][]){
        Queue<Integer>qq= new LinkedList<>();
        qq.offer(src);
        color[src]=0;
        while(!qq.isEmpty()){
            int node=qq.poll();
            for(int nbr:graph[node]){
                if(color[nbr]==-1){
                    color[nbr]=1-color[node];
                    qq.offer(nbr);
                }
                else if( color[nbr]==color[node]){
                   return false;
                }
            }
        }
        return true;
    }
}