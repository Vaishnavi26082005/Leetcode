class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]^k)>nums[i]){
                c++;
              map.put(nums[i],nums[i]^k);
            }
        }
        long sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
            sum+=map.get(nums[i]);
          }
          else{

            sum+=nums[i];
          }
          min=Math.min(min,Math.abs(nums[i]-(nums[i]^k)));
        }
        return c%2==0?sum:sum-min;
    }
}