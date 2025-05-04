class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int[] domino : dominoes) {
            int a = domino[0];
            int b = domino[1];

            
            int key = a < b ? a * 10 + b : b * 10 + a;

          
            result += map.getOrDefault(key, 0);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return result;
    }
}