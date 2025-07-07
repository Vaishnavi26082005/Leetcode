class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         ArrayList<ArrayList<int[]>>adj = new ArrayList<>();
        //  int n=flights.length;
          for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
          }

          for(int a[]:flights){
            int u=a[0];
            int v=a[1];
            int c=a[2];
            adj.get(u).add(new int[]{v,c});
          }
           PriorityQueue<int[]>pq= new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] p1,int []p2){
                return p1[1]-p2[1];
            }

           });
           int dist[][]= new int[n][k+2];
           for(int a[]:dist)
           Arrays.fill(a,Integer.MAX_VALUE);
           dist[src][0]=0;
           pq.add(new int[]{src,0,0});
           while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int node= curr[0];
            int d=curr[1];
            int stop=curr[2];
            if(node==dst)return d;
           
            if(stop<=k){
            for(int nbr[]:adj.get(node)){
                int v=nbr[0];
                int c=nbr[1];
                if(d+c<dist[v][stop+1]){
                    dist[v][stop+1]=d+c;
                    pq.offer(new int[]{v,d+c,stop+1});
                }
            }
           }}
    return -1;
    }
}