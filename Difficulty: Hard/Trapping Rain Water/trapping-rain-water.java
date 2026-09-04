class Solution {
    public int maxWater(int arr[]) {
        // code here
       
                int n=arr.length;
                int total=0;
                int left=0;
                int right=n-1;
                int leftMax=arr[0];
                int rightMax=arr[n-1];
                while(left<right){
                    if(arr[left]<arr[right]){
                         leftMax=Math.max(leftMax,arr[left]);
                            if(leftMax-arr[left]>0){
                                total+=leftMax-arr[left];
                            }
                            left++;

                    }else{
                         rightMax=Math.max(rightMax,arr[right]);
                            if(rightMax-arr[right]>0){
                                total+=rightMax-arr[right];
                            }
                            right--;

                    }
                }
                return total;

            }
        
    
}
