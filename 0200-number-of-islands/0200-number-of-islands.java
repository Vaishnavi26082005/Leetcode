class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean [][] visi= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!='0'&&!visi[i][j]){
                    dfs(grid,visi,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][]grid,boolean[][]visi,int r,int c){
         int n=grid.length;
        int m=grid[0].length;
        if(r>=n||r<0||c>=m||c<0||visi[r][c]||grid[r][c]=='0')return ;
        int k[]={0,0,-1,1};
        int l[]={1,-1,0,0};
        visi[r][c]=true;
        for(int i=0;i<k.length;i++){

            dfs(grid,visi,r+k[i],c+l[i]);
        }
    }
}