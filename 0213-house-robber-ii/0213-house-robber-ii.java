class Solution {
    public int rob(int[] arr) {
        int n=arr.length;

        if (arr.length == 1) {
            return arr[0];
        }
        return Math.max(find(arr,0,arr.length-2),find(arr,1,arr.length-1));
    }

    public int find(int arr[],int start,int end){
        int prev1=0;
        int prev2=0;
        int curr=0;
        for(int i=start;i<=end;i++){
          curr=Math.max(prev2+arr[i],prev1);
          prev2=prev1;
          prev1=curr;
        }
        return curr;
    }
}