class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}
