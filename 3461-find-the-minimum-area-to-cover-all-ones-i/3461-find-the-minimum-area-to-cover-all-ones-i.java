class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int minr = n, maxr = -1;
        int minc = m, maxc = -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                minr=Math.min(minr,i);
                minc=Math.min(minc,j);
                maxr=Math.max(maxr,i);
                maxc=Math.max(maxc,j);}
            }
        }
        int h=maxc-minc+1;
        int w=maxr-minr+1;
        return h*w;
            }
}