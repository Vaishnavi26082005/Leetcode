class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int n=arr.length;
        int profit=0;
        int max=0;
        for(int i=1;i<n;i++){
        profit=arr[i]-min;
        max=Math.max(max,profit);
        min=Math.min(min,arr[i]);
        }
        return max;
    }
}