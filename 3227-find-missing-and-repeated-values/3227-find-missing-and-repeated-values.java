class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set= new HashSet<>();
        int a=0;
        int b=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);

                }
                else{
                    a=grid[i][j];
                    
                }
            }
        }
        int m=grid.length;
        int k=grid[0].length;
        for(int i=1;i<=m*k;i++){
            if(!set.contains(i)){
                b=i;
            }
        }
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
       return arr; 
    }
}