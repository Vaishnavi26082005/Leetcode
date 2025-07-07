class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>>adj= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int [] a:times){
            int u=a[0];
            int v=a[1];
            int c=a[2];
            adj.get(u).add(new int[]{v,c});
        }
        int dist[]= new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]>pq= new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p1,int [] p2){
                return p1[1]-p2[1];
            }
        });
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            int node=curr[0];
            int d=curr[1];
            if(d>dist[node])continue;

            for(int[] nbr:adj.get(node)){
               int v=nbr[0];
               int c=nbr[1];
               if(d+c<dist[v]){
                dist[v]=d+c;
                pq.offer(new int[]{v,dist[v]});
               }
            }
        }
        int max=Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
           max=Math.max(max,dist[i]);      
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}