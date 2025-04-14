class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3)return 0;
        int i=0;
            int max=0;
        
            boolean p=false;
            boolean v=false;
           
            while(i<arr.length-1){

                if(arr[i]<arr[i+1]){
                   int  start=i;
                    while(i<arr.length-1&&arr[i]<arr[i+1]){
                        i++;
                   
                    p=true;}
                    while(i<arr.length-1&&arr[i]>arr[i+1]){
                        i++;
                        v=true;
                    }
                    if(p==true&&v==true)
                    max=Math.max(max,i-start+1);
                    p=false;
                    v=false;
                }
                else{
                    i++;
                }
            }
        
        return max;
    }
}