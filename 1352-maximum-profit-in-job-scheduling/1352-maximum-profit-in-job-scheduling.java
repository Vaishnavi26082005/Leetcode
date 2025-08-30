class Solution {

    public int bs(int arr[][],int l,int jend){
        int r=arr.length-1;
        int res=arr.length;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid][0]>=jend){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    public int solve(int[][]arr,int i,int dp[]){
        int n=arr.length;
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int next=bs(arr,i+1,arr[i][1]);
        int take=arr[i][2]+solve(arr,next,dp);
        int nt=solve(arr,i+1,dp);
       return dp[i]=Math.max(take,nt);
    }
    public int jobScheduling(int[] st, int[] endTime, int[] profit) {
        int n=st.length;
        int ar[][]=new int[n][3];
        for(int i=0;i<n;i++){
            ar[i][0]=st[i];
            ar[i][1]=endTime[i];
            ar[i][2]=profit[i];
        }
        Arrays.sort(ar,Comparator.comparingInt(a->a[0]));
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solve(ar,0,dp);
    }
}