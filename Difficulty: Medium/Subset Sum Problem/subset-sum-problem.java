class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {

        int n = arr.length;
        boolean[][] t = new boolean[n + 1][sum + 1];

        // initialization
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;   // sum = 0 is always possible
        }

        for (int j = 1; j <= sum; j++) {
            t[0][j] = false;  // no elements → no subset
        }

        // DP table filling
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}
