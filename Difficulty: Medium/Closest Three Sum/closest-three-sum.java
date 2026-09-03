class Solution {
    public int closest3Sum(int[] arr, int target) {

        int n = arr.length;
        Arrays.sort(arr);

        int res = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n - 2; i++) {

            int l = i + 1;
            int r = n - 1;

            while(l < r) {

                int sum = arr[i] + arr[l] + arr[r];

                if(Math.abs(sum - target) < minDiff) {
                    minDiff = Math.abs(sum - target);
                    res = sum;
                }
                else if(Math.abs(sum - target) == minDiff) {
                    res = Math.max(res, sum);
                }

                if(sum < target) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }

        return res;
    }
}