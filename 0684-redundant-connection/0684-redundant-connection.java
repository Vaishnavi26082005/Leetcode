class Solution {
    int t;
    public int[] findRedundantConnection(int[][] edges) {
        t=edges.length;
        DisjointSet dsu=new DisjointSet(t);
        int res[]=new int [2];
        for(int [] edge:edges){
           if(!dsu.union(edge[0]-1,edge[1]-1)){
           res=edge;
            return edge ;
           }
        }

      return res;  
    }
}
public class DisjointSet{
    int nodes;
    int parent[];
    int rank[];
    DisjointSet(int node){
        this.parent=new int[node];
        this.rank=new int[node];
        for(int i=0;i<node;i++){
            parent[i]=i;
        }}

        public int parent(int node){
            if(parent[node]==node)return node;
            parent[node]=parent(parent[node]);
            return parent[node];
        }

        public boolean union(int root1,int root2){
            int rp1=parent(root1);
            int rp2=parent(root2);
            if(rp1==rp2)return false;
            if(rank[rp1]<rank[rp2]){
                parent[rp1]=rp2;
            } 
            else if(rank[rp1]>rank[rp2]){
                parent[rp2]=rp1;
            }
            else{
                rank[rp1]++;
                parent[rp2]=rp1;
            }
             return true;
        }
    

}