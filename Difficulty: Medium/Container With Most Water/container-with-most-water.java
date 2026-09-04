class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int h=Math.min(arr[left],arr[right]);
            int width=right-left;
            int area=width*h;
            max=Math.max(max,area);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}