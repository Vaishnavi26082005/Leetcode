class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int er=image.length;
        int ec=image[0].length;
        boolean visi[][]=new boolean[er][ec];
        solve(sr,sc,er,ec,visi,color,image,image[sr][sc]);
        return image;
    }
    public void solve(int sr,int sc,int er,int ec,boolean[][]visi,int nc,int image[][],int cc){
        if(sr<0||sc<0||sr>=er||sc>=ec||image[sr][sc]!=cc||visi[sr][sc])return ;
        visi[sr][sc]=true;
        image[sr][sc]=nc;
        int r[]={0,0,-1,1};
        int c[]={1,-1,0,0};
        for(int i=0;i<r.length;i++){
            solve(sr+r[i],sc+c[i],er,ec,visi,nc,image,cc);
        }
    }
}