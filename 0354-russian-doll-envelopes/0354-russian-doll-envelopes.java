class Solution {
    public int maxEnvelopes(int[][] arr) {
       Arrays.sort(arr, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

       TreeSet<Integer>t=new TreeSet<>();
       for(int i=0;i<arr.length;i++){
        int x=arr[i][1];
        Integer big=t.ceiling(x);
        if(big!=null){
            t.remove(big);
        }
        t.add(x);
       }
       return t.size();
    }
}