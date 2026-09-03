class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==target) return true;
                else if(sum<target)
                l++;
                else
                r--;
                
                
            }
        }
        return false;
        
        
    }
}
