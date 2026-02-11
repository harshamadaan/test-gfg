class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0;
        int n = arr.length;

        while (j < n) {

            // Add negative numbers to queue
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            // Window size < k → expand window
            if (j - i + 1 < k) {
                j++;
            }

            // Window size == k
            else if (j - i + 1 == k) {

                // If queue empty → no negative → add 0
                if (q.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(q.peek());
                }

                // Remove element going out of window
                if (!q.isEmpty() && arr[i] == q.peek()) {
                    q.poll();
                }

                // Slide window
                i++;
                j++;
            }
        }

        return ans;
    }
}
