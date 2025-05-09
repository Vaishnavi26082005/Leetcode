class Solution {
    static int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};

    public int minTimeToReach(int[][] arr) {
      int n=arr.length;
      int m=arr[0].length;
      int res[][]=new int[n][m];
      for(int r[]:res){
        Arrays.fill(r,Integer.MAX_VALUE);
      }
      res[0][0]=0;

      PriorityQueue<int[]>pq= new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
      pq.offer(new int[]{0,0,0});
      while(!pq.isEmpty()){
        int curr[]=pq.poll();
        int t=curr[0];
        int i=curr[1];
        int j=curr[2];
        if(i==n-1&&j==m-1)return t;
        for(int d[]:dir){
            int ii=i+d[0];
            int jj=j+d[1];
            int move=(ii+jj)%2==0?2:1;
            if(ii>=0 &&ii<n &&jj>=0 &&jj<m){
                int brt=Math.max(arr[ii][jj]-t,0);
                int ft=brt+t+move;
                if(res[ii][jj]>ft){
                    res[ii][jj]=ft;
                    pq.offer(new int[]{ft,ii,jj});
                }
            }
        }

      }
      return -1;
    }
}