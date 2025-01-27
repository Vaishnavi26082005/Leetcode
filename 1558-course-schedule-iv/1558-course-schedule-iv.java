class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int n= numCourses;
        int m=prerequisites.length;
        boolean mat[][]= new boolean[n][n];
        for( int i=0;i<m;i++){
            int s= prerequisites[i][0];
            int d= prerequisites[i][1];
            mat[s][d]=true;
        }

        for(int k=0;k<n;k++){
            for(int s=0;s<n;s++){
                for(int d=0;d<n;d++){
                    mat[s][d]=mat[s][d]||mat[s][k]&&mat[k][d];
                }
            }
        }

        List<Boolean>ans= new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            int s= queries[i][0];
            int d=queries[i][1];
            ans.add(mat[s][d]);
        }
return ans;
    }
}