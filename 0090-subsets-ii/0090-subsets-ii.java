class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        Arrays.sort(nums);
        sub(nums,0,ans,l);
        return ans;
    }
    public static void sub(int[]arr,int idx,List<List<Integer>> ans ,List<Integer> l){
         ans.add(new ArrayList<>(l));
         
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue; 
            l.add(arr[i]);
            sub(arr,i+1,ans,l);
            l.remove(l.size()-1);
        }
    }
}