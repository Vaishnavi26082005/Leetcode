class Solution {
    public int findCenter(int[][] edges) {
       HashMap<Integer,HashMap<Integer,Integer>>map= new HashMap<>();
       int n=edges.length;
       for(int i=0;i<=n+1;i++){
        map.put(i,new HashMap<>());
       }
    for(int a[]:edges){
        int u=a[0];
        int v=a[1];
        map.get(u).put(v,0);
        map.get(v).put(u,0);
        if(map.get(u).size()==edges.length)return u;
         if(map.get(v).size()==edges.length)return v;
    }
    return -1;
    }
}