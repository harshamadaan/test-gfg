class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
