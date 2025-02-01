class Solution {
    public boolean isArraySpecial(int[] arr) {
        for(int i=1;i<arr.length;i++){
          
          if((arr[i]%2==0&&arr[i-1]%2==0)||arr[i]%2==1&&arr[i-1]%2==1){
            return false;
          }
        }
        return true;
    }
}