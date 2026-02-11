class Solution {
    public int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;
        int i = 0, j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < n) {

            // Step 1: Add current element
            sum += arr[j];

            // Step 2: If window size < k → expand
            if (j - i + 1 < k) {
                j++;
            }

            // Step 3: If window size == k
            else if (j - i + 1 == k) {

                // Update maximum
                maxSum = Math.max(maxSum, sum);

                // Slide window (remove left element)
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return maxSum;
    }
}
