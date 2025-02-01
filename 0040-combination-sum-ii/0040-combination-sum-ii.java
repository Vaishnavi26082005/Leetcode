class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<Integer>l= new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        Arrays.sort(candidates);

       cs(candidates,target,0,l,ans);
       return ans;
    }
    public void cs(int[] arr,int t,int idx,List<Integer>l,List<List<Integer>>ans){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(t<0)return;
        for(int i=idx;i<arr.length;i++){
             if (i > idx && arr[i] == arr[i - 1]) continue;
            
            l.add(arr[i]);
            cs(arr,t-arr[i],i+1,l,ans);
            l.remove(l.size()-1);

            
        }


    }
}