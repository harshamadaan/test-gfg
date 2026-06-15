class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        
        int maxSum=arr[0];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
