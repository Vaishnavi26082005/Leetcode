class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        boolean board[][]= new boolean[n][n];
        solve(board,0,n,ans);
        return ans;
        

    }
    public boolean issafe(boolean[][] board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col])return false;
            r--;
        }
        r=row;
        int c=col;
        while(r>=0&&c<board[0].length){
            if(board[r][c])return false;
            r--;c++;
        }
        r=row;c=col;
        while(r>=0&&c>=0){
            if(board[r][c])return false;
            r--;
            c--;
        }
        return true;
    }
    public void solve (boolean[][]board,int row,int n, List<List<String>> ans){
        if(n==0){
              List<String> l= new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s="";
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]){
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
        for(int col=0;col<board[0].length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                solve(board,row+1,n-1,ans);
                board[row][col]=false;
            }
        }
    }
}