public class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;

    }
}


class Solution {
    int dir[][] ={{-1,0},{0,-1},{1,0},{0,1}};
   public int[][] updateMatrix(int[][] mat) {
        LinkedList<Pair>qq=new LinkedList<>();


        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    qq.addLast(new Pair(i,j));

                }
                else{
                    mat[i][j]=-1;
                }

            }
        }
     while(qq.size()>0){
         Pair rem=qq.removeFirst();
         for(int i=0;i<4;i++){
        int row=rem.x+dir[i][0];
        int col=rem.y+dir[i][1];
        if(row>=0&&col>=0&&row<mat.length&&col<mat[0].length&&mat[row][col]<0){
            qq.addLast(new Pair(row,col));
            mat[row][col]=mat[rem.x][rem.y]+1;
        }
            
         }

     }

return mat;
    }
}