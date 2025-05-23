class Solution {
    public boolean bfs( ArrayList<ArrayList<Integer>>adj,int node,int[]color){
        Queue<Integer>qq= new LinkedList<>();
        qq.offer(node);
        color[node]=1;
        while(!qq.isEmpty()){
            int r=qq.poll();
             for(int v:adj.get(r)){
                if(color[r]==color[v])return false;
                if(color[v]==-1){
                    qq.offer(v);
                    color[v]=1-color[r];
                }
             }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int a[]:dislikes){
            int u=a[0];
            int v=a[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int [] color=new int[n+1];
        Arrays.fill(color,-1);
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!bfs(graph,i,color))return false;
            }
        }
        return true;
    }
}