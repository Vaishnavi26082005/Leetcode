class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int dist[]= new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        ArrayList<ArrayList<int[]>>arr= new ArrayList<>();
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<>());
        }
        for(int []a:times){
            int u=a[0];
            int v=a[1];
            int w=a[2];
            arr.get(u).add(new int[]{v,w});
            // arr.get(v).add(new int[]{u,w});
        }
        PriorityQueue<int[]>pq= new PriorityQueue<>(new Comparator<>(){
            public int compare(int []p1,int[]p2){
                return p1[1]-p2[1];

            }

        });
        pq.add(new int[]{k,0});
        dist[k]=0;
        while(!pq.isEmpty()){
            int curr[]= pq.poll();
            int node=curr[0];
            int d=curr[1];
            if(d>dist[node])continue;
            for(int a[]:arr.get(node)){
              int v=a[0];
              int w=a[1];
              if(d+w<dist[v]){
                dist[v]=d+w;
                pq.add(new int[]{v,d+w});
              }
            }

        }
        int min=Integer.MIN_VALUE;
        boolean f=false;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)f=true;
            min=Math.max(min,dist[i]);
        }
return f==true?-1:min;

    }
}