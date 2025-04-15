class Solution {
    public int lengthOfLIS(int[] arr) {
       TreeSet<Integer>t=new TreeSet<>();
       for(int i=0;i<arr.length;i++){
        int x=arr[i];
        Integer big=t.ceiling(x);
        if(big!=null){
            t.remove(big);
        }
        t.add(x);
       }
       return t.size();
    }
}