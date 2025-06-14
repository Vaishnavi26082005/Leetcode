class Solution {
    public int max(int [] piles){
        int max=0;
        for(int p:piles){
            max=Math.max(p,max);
        }
        return max;
    }
    public boolean ishelp(int arr[],int h,int mid){
        int t=0;
        for(int a:arr){
            t+=Math.ceil((double)a/mid);
        }
        return t<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=max(piles);
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ishelp(piles,h,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
return ans;
    }
}