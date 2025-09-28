class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> res  =new ArrayList<>();
      boolean [][] vis= new boolean[n][n];
      queen(res,vis,0,n);
      return res;
    }
    public static boolean issafe(int row, int col,boolean[][]vis){
        int r=row;
        while(r>=0){
            if(vis[r][col])return false;
            r--;
        }
        r=row;
        int c=col;
        while(r>=0&&c>=0){
            if(vis[r][c])return false;
            r--;
            c--;

        }
        r=row;
        c=col;
        while(r>=0&&c<vis[0].length){
            if(vis[r][c])return false;
            r--;c++;
        }
    return true;
    }

    public static void queen(List<List<String>> ans,boolean[][]vis,int row,int n){
       if(n==0){
        ArrayList<String>l= new ArrayList<>();
        for(int i=0;i<vis.length;i++){
            String s="";
            for(int j=0;j<vis[0].length;j++){
                if(vis[i][j]){
                    s+="Q";
                }
                else{
                    s+=".";
                }
            }
            l.add(s);
        }
        ans.add(l);
        return;
       }

       for(int i=0;i<vis[0].length;i++){
        if(issafe(row,i,vis)){
            vis[row][i]=true;
            queen(ans,vis,row+1,n-1);
            vis[row][i]=false;
        }
       }
    }
}