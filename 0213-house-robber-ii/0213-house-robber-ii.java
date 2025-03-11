class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob1(nums, 0, nums.length - 2), rob1(nums, 1, nums.length - 1));
    }

    private int rob1(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;
        int curr=0;
        for (int i = start; i <= end; i++) {
            curr = Math.max(nums[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}
