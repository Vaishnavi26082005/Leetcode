class Solution {
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int row[]=new int [n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(grid[i][j]==1){
                row[i]++;
                col[j]++;
                count++;
 
              }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(row[i]==1&&col[j]==1)
                    count--;
                }
            }
        }
        return count;
    }
}