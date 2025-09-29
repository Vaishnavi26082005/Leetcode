class Solution {
    // helper function with memoization
    public static int solve(int i, int[] arr, int j, int[][] dp) {
        // base case: less than 3 vertices
        if (j - i + 1 < 3) return 0;

        // already computed
        if (dp[i][j] != -1) return dp[i][j];

        int result = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {
            int wt = arr[i] * arr[k] * arr[j]
                    + solve(i, arr, k, dp)
                    + solve(k, arr, j, dp);

            result = Math.min(result, wt);
        }

        return dp[i][j] = result;
    }

    public int minScoreTriangulation(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        // fill with -1 to indicate not computed
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                dp[a][b] = -1;
            }
        }

        return solve(0, arr, n - 1, dp);
    }
}
