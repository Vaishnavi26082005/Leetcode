class Solution {
    public long countBadPairs(int[] nums) {
        long n=nums.length;
        long top=n*(n-1)/2;
        long count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            count+=map.getOrDefault(i-nums[i],0);
            map.put(i-nums[i],map.getOrDefault(i-nums[i],0)+1);

        }
        return top-count;
        
    }
}