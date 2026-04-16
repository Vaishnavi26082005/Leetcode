class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer,List<Integer>>map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
                 
            }
            map.get(nums[i]).add(i);
            
        }
        List<Integer>ans= new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            int val=queries[i];
            List<Integer> p=map.get(nums[val]);
           
             if (p.size() == 1) {
                ans.add(-1);
                continue;
            }
            int pos=Collections.binarySearch(p,val);
          int left = p.get((pos - 1 + p.size()) % p.size());
            int right=p.get((pos+1)%p.size());
            int al=Math.min(Math.abs(val-left),nums.length-(Math.abs(val-left)));
            int rl=Math.min(Math.abs(val-right),nums.length-(Math.abs(val-right)));
            int an=Math.min(al,rl);
            ans.add(an);
        }
        return ans;
    }
}