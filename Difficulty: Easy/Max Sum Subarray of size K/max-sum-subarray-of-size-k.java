class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0,j=0;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1==k){
                maxSum=Math.max(sum,maxSum);
                sum=sum-arr[i];
                i++;
                j++;
                
             }else{
                 j++;

            }
        }
        return maxSum;
    }
 }