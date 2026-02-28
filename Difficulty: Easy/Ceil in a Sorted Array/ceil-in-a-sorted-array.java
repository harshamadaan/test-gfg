// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n=arr.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            
            if(arr[mid]<x){
                l=mid+1;
            }else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
    }
}
