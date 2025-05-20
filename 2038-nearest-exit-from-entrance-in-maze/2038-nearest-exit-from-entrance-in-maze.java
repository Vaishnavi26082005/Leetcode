class Solution {
    int[][] direc={{-1,0},{1,0},{0,-1},{0,1}};
    public int nearestExit(char[][] maze, int[] i) {
      Queue<int[]>qq= new LinkedList<>();
      int n=maze.length;
      int m= maze[0].length;
      qq.offer(new int[]{i[0],i[1]});
      int step=0;
      maze[i[0]][i[1]]='+';
      while(!qq.isEmpty()){
        int size=qq.size();
        while(size-->0){
            int[]curr=qq.poll();
            int r=curr[0];
            int c=curr[1];
            if((r!=i[0]||c!=i[1])&&(r==0||c==0||r==n-1||c==m-1))return step;
            for(int[]dir:direc){
                int d=r+dir[0];
                int e=c+dir[1];
                if(d>=0&&d<n&&e>=0&&e<m&&maze[d][e]!='+'){
                    qq.offer(new int[]{d,e});
                    maze[d][e]='+';
                }

            }
        }
        step++;

      }
      return -1;

    }
}