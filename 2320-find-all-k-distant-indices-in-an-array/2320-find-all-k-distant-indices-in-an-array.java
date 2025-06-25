class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List <Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                int min=Math.max(i-k,0);
                int max=Math.min(i+k,nums.length-1);
                if(!res.isEmpty()&&res.get(res.size()-1)>=min){
                    min=res.get(res.size()-1)+1;
                }
                for(int z=min;z<=max;z++){
                    res.add(z);
                }
            }
        }
return res;
    }
}