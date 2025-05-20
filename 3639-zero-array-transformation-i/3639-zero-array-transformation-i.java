class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {

     int arr[]= new int [nums.length];
     for (int a[]: queries){
        int l=a[0];
        int r=a[a.length-1]+1;
        arr[l]+=1;
        if(r<arr.length)
        arr[r]-=1; 
     }   
     for(int i=1;i<arr.length;i++){
        arr[i]+=arr[i-1];
     }
     for(int i=0;i<arr.length;i++){
        if(arr[i]<nums[i])return false;
     }
     return true;
    }
}