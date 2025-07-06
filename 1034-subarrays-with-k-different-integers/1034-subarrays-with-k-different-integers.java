class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
       return ds(arr,k)-ds(arr,k-1);
    }
    public int ds(int [] arr,int k){
         int si=0;
        int ei=0;
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(ei<arr.length){
            map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
            while(map.size()>k){
                int z=arr[si];
                map.put(z,map.get(z)-1);
                if(map.get(z)==0){
                    map.remove(z);
                }
                si++;
            }
            if(map.size()<=k){
                c+=(ei-si+1);
            }
            ei++;
        }
        return c;
    }
}