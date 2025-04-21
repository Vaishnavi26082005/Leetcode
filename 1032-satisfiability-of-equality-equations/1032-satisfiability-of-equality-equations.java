class Solution {
    public boolean equationsPossible(String[] equations) {
        ArrayList<int[]>ne=new ArrayList<>();
        DisSet s= new DisSet(26);
        for(String e:equations){
            int u=e.charAt(0)-'a';
            int v=e.charAt(3)-'a';

            if(e.charAt(1)== '='){
                s.union(u,v);

            }
            else{
               ne.add(new int[]{u,v}); 
            }
        }
     for(int [] e:ne){
        int u=e[0];
        int v=e[1];
        if(s.root(u)==s.root(v))return false;
     }
return true;
    }
}
public class DisSet{
    int node;
    int [] parent;
    int [] rank;
   public DisSet(int node){
    this.node =node;
    parent=new int[node];
    rank=new int [node];
     for(int i=0;i<node;i++){
        parent[i]=i;
    }
   }

   public int root(int node){
    if(parent[node]==node)return node;
    parent[node]=root(parent[node]);
    return parent[node];
   }

   public  void union(int rp1,int rp2){
    int r1=root(rp1);
    int r2=root(rp2);
    if(r1==r2)return ;
    if(rank[r1]<rank[r2]){
        parent[r1]=r2;
    }
    else if(rank[r1]>rank[2]){
        parent[r2]=r1;
    }
    else{
        rank[r1]++;
        parent[r2]=r1;
    }

   }

}