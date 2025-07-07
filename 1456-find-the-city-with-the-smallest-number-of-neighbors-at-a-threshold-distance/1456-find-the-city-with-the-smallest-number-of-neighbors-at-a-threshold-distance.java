class Solution {
    public int findTheCity(int n, int[][] edges, int z) {
        int[][] dist= new int [n][n];
        for(int a[]:dist)Arrays.fill(a,1000004);
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        for(int a[]:edges){
            int u=a[0];
            int v=a[1];
            int c=a[2];
            dist[u][v]=c;
            dist[v][u]=c;
        }

        for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
            }
        }
    }
    int min=n;
    int cnt=0;
    int city=-1;

    for(int i=0;i<n;i++){
        cnt=0;
        for(int j=0;j<n;j++){
            if(dist[i][j]<=z){
                cnt++;
            }
        }
        if(cnt<=min){
            min=cnt;
            city=i;
        }
       
    }
   return city;
}
  
}
