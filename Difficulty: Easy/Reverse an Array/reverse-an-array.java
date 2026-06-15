class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        int n=arr.length;
        int l=0,h=n-1;
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            
            l++;
            h--;
        }
        
    }
}