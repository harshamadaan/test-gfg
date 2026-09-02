class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
         int[] res=new int[n];
        for(int i=0;i<n;i++){
           
            res[i]=1;
        }
        int pre=1;
        for(int i=0;i<n;i++){
            res[i]=pre;
            pre=arr[i]*pre;
        }
        int post=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*post;
            post=arr[i]*post;
        }
        return res;
    }
}
