class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int largest=arr[0];
        int secLarg=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secLarg=largest;
                largest=arr[i];
            }else if(arr[i]>secLarg && arr[i]!=largest){
                secLarg=arr[i];
            }
        }
        return secLarg;
    }
}