class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int n=arr.length;
        int ele=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                ele=arr[i];
            }
        }
        return ele;
    }
}