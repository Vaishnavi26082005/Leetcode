class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int length = 0;
        boolean hasCenter = false;

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (map.getOrDefault(rev, 0) > 0) {
                length += 4;
                map.put(rev, map.get(rev) - 1);
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : map.keySet()) {
            if (key.charAt(0) == key.charAt(1) && map.get(key) > 0) {
                hasCenter = true;
                break;
            }
        }

        return hasCenter ? length + 2 : length;
    }
}
