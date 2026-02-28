class Solution {

    public static int findClosest(int[] arr, int k) {

        int n = arr.length;
        int l = 0, h = n - 1;

        // binary search
        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (arr[mid] == k) {
                return arr[mid];
            }
            else if (arr[mid] < k) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }

        // edge cases
        if (l >= n) return arr[h];
        if (h < 0) return arr[l];

        // compare differences
        int leftDiff = Math.abs(arr[h] - k);
        int rightDiff = Math.abs(arr[l] - k);

        // if equal → return greater element (arr[l])
        if (rightDiff <= leftDiff)
            return arr[l];
        else
            return arr[h];
    }
}