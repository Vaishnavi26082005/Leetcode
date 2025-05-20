class Solution {
 int min=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
      HashMap<Integer,HashMap<Integer,Integer>>map= new HashMap<>();
      for(int i=1;i<=n;i++){
        map.put(i,new HashMap<>());

      } 
      
      for(int a[]:roads){
        int u=a[0];
        int v=a[1];
        int c=a[2];
    

        map.get(u).put(v,c);
        map.get(v).put(u,c);

      }
      boolean[] visi= new boolean[n+1];
      dfs(map,1,visi);
return min;
    }
    public void dfs(HashMap<Integer,HashMap<Integer,Integer>>map,int src,boolean[] visi){
        visi[src]=true;
        for(int r:map.get(src).keySet()){
            min=Math.min(min,map.get(src).get(r));
            if(!visi[r])
            dfs(map,r,visi);
        }
    }
} 
