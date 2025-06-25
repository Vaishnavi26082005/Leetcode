class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int brr[]= new int[n];
        brr[0]=arr[0];

        for(int i=1;i<n;i++){
          brr[i]=arr[i]^brr[i-1];
        }
        int m=queries.length;
        int srr[]=new int[m];
        int i=0;
        for(int a[]:queries){
            int s=a[0];
            int e=a[1];
          if(i<m&& s==0){
            srr[i]=brr[e];
          }
          else{
        
            srr[i]=brr[e]^brr[s-1];
          }
          i++;
        }
        return srr;
    }
}