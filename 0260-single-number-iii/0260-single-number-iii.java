class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int mask=xor&(-xor);
        int a=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask)!=0){
                a^=nums[i];
            }

        }
        int b=xor^a;
        return  new int[]{a,b};
        
    }
}