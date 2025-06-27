class Solution {
    private int memo[];
    private int n;
    

    public int generate(int arr[][],int l,int current_end){
        int r= n-1;
        int ans=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid][0]>=current_end){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int solve(int arr[][],int i){
        if(i>=n)return 0;
        if(memo[i]!=-1)return memo[i];
        int next =generate(arr,i+1,arr[i][1]);
        int taken=arr[i][2]+solve(arr,next);
        int not_taken=solve(arr,i+1);
        return memo[i]=Math.max(taken,not_taken);
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        n = startTime.length;
        int arr[][]= new int[n][3];
       for(int i=0;i<n;i++){
        arr[i][0]=startTime[i];
        arr[i][1]=endTime[i];
        arr[i][2]=profit[i];
       }

        memo = new int[n];
        Arrays.fill(memo, -1);

       Arrays.sort(arr,Comparator.comparingInt(a->a[0]));
       return solve(arr,0);
    }
}