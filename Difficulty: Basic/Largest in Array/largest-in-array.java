class Solution {
    public static int largest(int[] arr) {
        // code here
        int n=arr.length;
        int maxEle=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
            
        }
        return maxEle;
        
    }
}
