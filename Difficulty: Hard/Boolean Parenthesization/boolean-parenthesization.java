// User function Template for Java
class Solution {

    static long[][][] dp;

    static long countWays(String s) {

        int n = s.length();
        dp = new long[n][n][2];

        // initialize with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        // count ways to make expression TRUE
        return solve(s, 0, n - 1, 1);
    }

    static long solve(String s, int i, int j, int isTrue) {

        if (i > j)
            return 0;

        if (i == j) {
            if (isTrue == 1)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        if (dp[i][j][isTrue] != -1)
            return dp[i][j][isTrue];

        long ans = 0;

        for (int k = i + 1; k <= j - 1; k += 2) {

            long lt = solve(s, i, k - 1, 1);
            long lf = solve(s, i, k - 1, 0);
            long rt = solve(s, k + 1, j, 1);
            long rf = solve(s, k + 1, j, 0);

            char op = s.charAt(k);

            if (op == '&') {
                if (isTrue == 1)
                    ans += lt * rt;
                else
                    ans += lt * rf + lf * rt + lf * rf;
            }
            else if (op == '|') {
                if (isTrue == 1)
                    ans += lt * rt + lt * rf + lf * rt;
                else
                    ans += lf * rf;
            }
            else if (op == '^') {
                if (isTrue == 1)
                    ans += lt * rf + lf * rt;
                else
                    ans += lt * rt + lf * rf;
            }
        }

        return dp[i][j][isTrue] = ans;
    }
}
