class Solution {
    public int findTheCity(int n, int[][] edges, int t) {
        int[][] mat = new int[n][n];
        
        for(int a[]:mat){
            Arrays.fill(a,Integer.MAX_VALUE/2);
        }
        for(int i=0;i<n;i++){
            mat[i][i]=0;
        }
        for(int a[]:edges){
            int u=a[0];
            int v=a[1];
            int w=a[2];
            mat [u][v]=w;
            mat[v][u]=w;

        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                }
            }
        }
  int nas=Integer.MAX_VALUE;
  int city=0;
     for(int i=0;i<n;i++){
        int cnt=0;
        for(int j=0;j<n;j++){
            if(mat[i][j]<=t)cnt++;
        }
        if(nas>=cnt){
          nas=cnt;
          city =i;
        }
     }
     return city;
    }
}