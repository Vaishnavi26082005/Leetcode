import java.util.*;

class Solution {
    List<String> happyStrings = new ArrayList<>();

    public String getHappyString(int n, int k) {
        String a = "";
        generateHappyStrings(n, a);
        if (happyStrings.size() < k) return "";
        Collections.sort(happyStrings);
        return happyStrings.get(k - 1);
    }

    protected void generateHappyStrings(int n, String b) {
        if (b.length() == n) {
            happyStrings.add(b);
            return;
        }
        for (char c='a';c<='c'; c++) {
            if (b.length() > 0 && b.charAt(b.length() - 1) == c) continue;
            generateHappyStrings(n, b + c);
        }
    }
}
