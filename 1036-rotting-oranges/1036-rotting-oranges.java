class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int co=0;
        Queue<int[]>qq=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)co++;
                if(grid[i][j]==2){
                    qq.offer(new int[]{i,j});
                }
               
            }
        }
        int t=0;
        if(co==0)return 0;
        while(!qq.isEmpty()){
            int s=qq.size();
            for(int i=0;i<s;i++){
                int nbr[]=qq.poll();
                int r=nbr[0];
                int c=nbr[1];
                int ne[][]={{r-1,c},{r+1,c},{r,c-1},{r,c+1}};
                for(int np[]:ne){
                    int nr=np[0];
                    int nc=np[1];
                    if(nr<0||nr>=n||nc<0||nc>=m||grid[nr][nc]!=1){
                        continue;
                    }else{
                        qq.offer(new int[]{nr,nc});
                         grid[nr][nc]=2;
                         co--;

                    }
                }}
                t++;
                if(co==0)break;
            
 }
        return co==0?t:-1;
    }
}