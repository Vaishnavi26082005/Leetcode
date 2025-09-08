class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]= new int[m+n];
        int  i =0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
            arr[k++]=nums1[i];
            i++;
            }
            else if(nums2[j]<=nums1[i]){
                arr[k++]=nums2[j];
                j++;
            }
            
        }
        while(i<m){
            arr[k++]=nums1[i++];
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }
      for(int x=0;x<m+n;x++){
       nums1[x]=arr[x];
      }

    }
}