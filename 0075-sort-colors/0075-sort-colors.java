class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int mid=0;
        while(mid<=e){
            switch(nums[mid]){
                case 0:{
                swap(nums,mid,s);
                mid++;
                s++;
                break;}
                case 1:{
                mid++;
                break;}
                case 2:{
                    swap(nums,mid,e);
                    e--;
                   break;
                }
            }
        }

    }
    public  void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}