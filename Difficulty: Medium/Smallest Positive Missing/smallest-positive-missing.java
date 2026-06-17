class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int num=1;
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                num++;
            }
        }
        return num;
    }
}
