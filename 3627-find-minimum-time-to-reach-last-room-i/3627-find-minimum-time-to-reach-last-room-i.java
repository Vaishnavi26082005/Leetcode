class Solution {
    static int [][] dir={{-1,0},{0,-1},{1,0},{0,1}};
    public int minTimeToReach(int[][] movieTime) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        int n=movieTime.length;
        int m= movieTime[0].length;
        int res[][]= new int[n][m];
        for(int[]r:res){
            Arrays.fill(r,Integer.MAX_VALUE);

        }
        res[0][0]=0;
        pq.offer(new int[]{0,0,0});
        while(!pq.isEmpty()){
           int []curr=pq.poll();
           int t=curr[0];
           int i=curr[1];
           int j=curr[2];
           if(i==n-1&&j==m-1)return t;
           for(int []d:dir) {
            int ii=i+d[0];
            int jj=j+d[1];
            if(ii>=0&&ii<n&&jj>=0&&jj<m){
                int wait=Math.max(movieTime[ii][jj]-t,0);
                int finaltime=wait+t+1;
                if(res[ii][jj]>finaltime){
                    res[ii][jj]=finaltime;
                    pq.offer(new int[]{finaltime,ii,jj});
                }

            }
           }

        }
        return -1;

    }
}