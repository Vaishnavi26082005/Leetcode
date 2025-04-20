class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DisSet alice=new DisSet(n);
        DisSet bob=new DisSet(n);
        int e=0;
        for(int []edge:edges){
            if(edge[0]==3){
                e+=alice.union(edge[1],edge[2])|bob.union(edge[1],edge[2]);
            }
        }

         for(int []edge:edges){
            if(edge[0]==2){
                e+=bob.union(edge[1],edge[2]);
            }
            if(edge[0]==1){
                e+=alice.union(edge[1],edge[2]);
            }
        }

        if(alice.component==1&&bob.component==1){
            return edges.length-e;
        }

return -1;

    }
}
public class DisSet{
    int node;
    int parent[];
    int rank[];
    int component;
    public DisSet(int node){
        this.node= node;
        this.component=node;
    parent= new int[node+1];
    rank=new int[node+1];
    for(int i=0;i<=node;i++){
      parent [i]=i;
    }

    }


 public int parent(int node){
            if(parent[node]==node)return node;
            parent[node]=parent(parent[node]);
            return parent[node];
        }

        public int union(int root1,int root2){
            int rp1=parent(root1);
            int rp2=parent(root2);
            if(rp1==rp2){return 0;}
            component--;
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
             return 1;
        }


}