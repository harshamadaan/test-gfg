// User function Template for Java
class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }if(mid-1>=l && arr[mid-1]==target){
                return mid-1;
                
            }if(mid+1<=h && arr[mid+1]==target){
                return mid+1;
                
                
            }
            if(arr[mid]<target){
                l=mid+2;
            }else{
                h=mid-2;
            }
        }
        return -1;
        
    }
}