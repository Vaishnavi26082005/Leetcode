class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        sub(nums,0,ans,l);
        return ans;
    }
    public static void sub(int[]arr,int i,List<List<Integer>> ans ,List<Integer> l){
        if(i==arr.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(arr[i]);
        sub(arr,i+1,ans,l);
        l.remove(l.size()-1);
        sub(arr,i+1,ans,l);
    }
}