// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        
        // Your code goes here
        int n=arr.length;
        int l=0,h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==1){
                ans=mid;
                h=mid-1;
                
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}