class Solution {
    public int jump(int[] arr) {
        int jumps = 0, end = 0, farthest = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
