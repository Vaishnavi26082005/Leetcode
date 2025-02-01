class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>l= new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
       cs(candidates,target,0,l,ans);
       return ans;
    }
    public void cs(int[] arr,int t,int idx,List<Integer>l,List<List<Integer>>ans){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(t>=arr[i]){
            l.add(arr[i]);
            cs(arr,t-arr[i],i,l,ans);
            l.remove(l.size()-1);

            }
        }


    }
}