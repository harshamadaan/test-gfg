class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int n=arr.length;
        // for(int i=0;i<n;i++){
            Arrays.sort(arr);
            
        // }
        for(int i=0;i<=k;i++){
                return arr[k-1];
                
            }
            return -1;
    }
}
