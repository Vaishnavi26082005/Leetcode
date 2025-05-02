class Solution {
    class Pair{
        int d;
        int wt;
        public Pair(int x,int wt){
            this.d=x;
            this.wt=wt;

        }
    }
    public int minCostToSupplyWater(int n, int[] well, int[][] nums) {
        HashMap<Integer,List<Pair>>map= new HashMap<>();
            for(int i=0;i<=n;i++){
                map.put(i,new ArrayList<>());
            }
        
        for(int i=1;i<=n;i++){
            map.get(i).add(new Pair(0,well[i-1]));
            map.get(0).add(new Pair(i,well[i-1]));

        }
        for(int i=0;i<nums.length;i++){
            int u=nums[i][0];
            int v=nums[i][1];
            int w=nums[i][2];
            map.get(u).add(new Pair(v,w));
            map.get(v).add(new Pair(u,w));
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
int sum=0;

        boolean[] visi=new boolean[n+1];
       pq.offer(new Pair(0,0));
       while(!pq.isEmpty()){
        Pair p= pq.poll();
        int src=p.d;
        int wet=p.wt;
        if(visi[src]==true)continue;
        visi[src]=true;
        sum+=wet;
        for(Pair u:map.get(src)){
            pq.add(new Pair(u.d,u.wt));
        }

       }
return sum;
    }
}