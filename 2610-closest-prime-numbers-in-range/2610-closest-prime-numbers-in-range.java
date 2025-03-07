class Solution {
    public int[] closestPrimes(int left, int right) {
        int n=right+1;
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=right;i++){
            if(arr[i]){
                for(int j=i*i;j<=right;j+=i)
                arr[j]=false;
            }
        }
        int prev=-1;
        int res[]={-1,-1};
        int min=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(arr[i]){
            if(prev==-1){
                prev=i;
            }
            else{
                if(i-prev<min){
                   
                    res[0]=prev;
                    res[1]=i;
                    min=i-prev;
                }
                prev=i;
            }}
        }
        return res;
    }

}