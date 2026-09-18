class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<Integer> input = new ArrayList<>();
                for (int n : arr) input.add(n);

                ArrayList<ArrayList<Integer>> result = new ArrayList<>();
                ArrayList<Integer> output = new ArrayList<>();

                solve(input, output, result);
                return result;
            }

            void solve(ArrayList<Integer> ip, ArrayList<Integer> op, ArrayList<ArrayList<Integer>> res) {
                // Base case — when input becomes empty
                if (ip.size() == 0) {
                    res.add(new ArrayList<>(op));
                    return;
                }

                // Create copies for the two recursive paths
                ArrayList<Integer> op1 = new ArrayList<>(op); // exclude case
                ArrayList<Integer> op2 = new ArrayList<>(op); // include case

                // Include first element in op2
                op2.add(ip.get(0));

                // Remove first element from input
                ArrayList<Integer> newIp = new ArrayList<>(ip);
                newIp.remove(0);

                // Recursive calls
                solve(newIp, op1, res); // exclude
                solve(newIp, op2, res); // include
        
    }
}