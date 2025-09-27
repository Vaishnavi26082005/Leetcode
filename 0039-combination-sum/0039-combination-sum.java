class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        cs(arr,0,t,ans,l);
        return ans;

    }
    public static void cs(int []arr,int idx,int t,List<List<Integer>> ans, List<Integer> l ){
        if(t==0){
            ans.add(new ArrayList<>(l));
        }

        for(int i=idx;i<arr.length;i++){
            l.add(arr[i]);
            if(t-arr[i]>=0){
            cs(arr,i,t-arr[i],ans,l);
            }
            l.remove(l.size()-1);
        }
    }
}