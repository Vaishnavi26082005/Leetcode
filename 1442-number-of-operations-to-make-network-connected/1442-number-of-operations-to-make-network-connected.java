class Solution {
    public int makeConnected(int n, int[][] arr) {
        if(arr.length<n-1)return -1;
        
        DisSet s=new DisSet(n);
        int c=0;

        for(int []a:arr){
            int u=a[0];
            int v=a[1];
            if(s.union(u,v)){
                c++;
                }
        }

        return n-1-c;

    }

}
public class DisSet{
    int node;
    int parent[];
    int rank[];
    public DisSet(int node){
        this.node= node;
        parent= new int[node];
        rank=new int[node];
        for(int i=0;i<node;i++){
            parent[i]=i;
        }
    }
    public int root(int node){
        if(parent[node]==node)return node;
        parent[node]=root(parent[node]);
        return parent[node];

    }

    public  boolean union(int rp1,int rp2){
    int r1=root(rp1);
    int r2=root(rp2);
    if(r1==r2)return false ;
    if(rank[r1]<rank[r2]){
        parent[r1]=r2;
    }
    else if(rank[r1]>rank[r2]){
        parent[r2]=r1;
    }
    else{
        rank[r1]++;
        parent[r2]=r1;
    }
    return true;
   }
}