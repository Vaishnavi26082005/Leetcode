class Solution {
    public int minOperations(int[] nums, int k) {
      PriorityQueue<Long>pq= new PriorityQueue<>();
      int count=0;
      for(int num:nums){
        pq.add((long)num);
      }
      while(pq.size()>=2&&pq.peek()<k){
        long a=pq.poll();
        long b=pq.poll();
        pq.add(a*2+b);
        count++;
      }
      return count;
    }
}