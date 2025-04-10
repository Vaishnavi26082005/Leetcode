class Solution {
    public int[] dijakstra(ArrayList<ArrayList<int[]>>adj,int src,int n){
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[]p1,int[]p2){
                return p1[1]-p2[1];
            }
        });
        int times[]=new int[n];
         Arrays.fill(times,Integer.MAX_VALUE);
         times[src]=0;
         pq.offer(new int[]{src,0});
         while(!pq.isEmpty()){
            int pair[]=pq.poll();
            int u=pair[0];
            int d=pair[1];
            if(d>times[u])continue;
            for(int arr[]:adj.get(u)){
                int v=arr[0];
                int w=arr[1];
                if(times[u]+w<times[v]){
                    times[v]=times[u]+w;
                    pq.offer(new int[]{v,times[v]});
                }
            }
         }return times;
    } 
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>>adj= new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int arr[]:times){
            int u=arr[0]-1;
            int v=arr[1]-1;
            int w=arr[2];
            adj.get(u).add(new int[]{v,w});
        }
        int[] brr=dijakstra( adj,k-1,n);
        int res=Integer.MIN_VALUE;
       for(int i = 0; i < n; i++) {
    if(brr[i] == Integer.MAX_VALUE) return -1;
    res = Math.max(brr[i], res);
}

return res;
    }
}