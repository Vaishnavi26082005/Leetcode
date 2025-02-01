class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>res= new ArrayList<>();
        boolean board[][]= new boolean[n][n];
        queen(res,board,0,n);
        return res;

        
    }
    public static boolean issafe(boolean[][]board,int row,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]==true)return false;
            r--;
        }
         r= row;
       int c= col;
        while(r>=0&&c>=0){
            if(board[r][c]==true)return false;
            r--;
            c--;

        }
        r=row;
        c=col;
        while(r>=0&&c<board[0].length){
            if(board[r][c]==true)return false;
            r--;
            c++;
        }
        return true;

    }



    public static void queen(List<List<String>>res,boolean[][] board,int row,int n){
      if(n==0){
           ArrayList<String>l= new ArrayList<>();
           for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==true){
                    s+="Q";
                }
                else{
                    s+=".";
                }
            }
            l.add(s);
           }
           res.add(l);
           return;
        }
        for(int col=0;col<board[0].length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                queen(res,board,row+1,n-1);
                board[row][col]=false;
            }
        }
    }
}