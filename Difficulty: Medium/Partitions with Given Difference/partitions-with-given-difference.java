class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int n=arr.length;
        int totalSum=0;
        for(int x: arr) totalSum+=x;
        
        if((totalSum+diff) %2!=0) return 0;
        
        int target=(totalSum+diff)/2;
        
        //table
        int[][] t=new int[n+1][target+1];
        for(int i=0;i<=n;i++)
        t[i][0]=1;
        for(int j=1;j<=target;j++)
        t[0][j]=0;
        
        //fill
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] + t[i-1][j];
                }else{
                     t[i][j]=t[i-1][j];
                }
            }
            
        }
        return t[n][target];
        
    }
}
