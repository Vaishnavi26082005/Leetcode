class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r=grid.length;
        int c= grid[0].length;

        int visi[][]=new int[r][c];
        int ri[]={-1,1,0,0,-1,1,-1,1};
        int ci[]={0,0,-1,1,1,1,-1,-1};

        Queue<int[]>qq=new LinkedList<>();
        if(grid[0][0]==0)qq.add(new int[]{1,0,0});
        else return-1;
         visi[0][0]=1;
        while(!qq.isEmpty()){
            int temp[]=qq.poll();
            int i=temp[1];
            int j=temp[2];
            int dis=temp[0];
            if(i==r-1&&j==c-1)return dis;
            for(int k=0;k<8;k++){
                int nr=i+ri[k];
                int nc=j+ci[k];
                if(nr>=0&&nc>=0&&nr<r&&nc<c&&visi[nr][nc]==0&&grid[nr][nc]==0){
            visi[nr][nc]=1;
                    qq.add(new int[]{dis+1,nr,nc});
                }
            }

        }

        return -1;
    }
}