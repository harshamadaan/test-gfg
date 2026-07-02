class Solution {
    static int[][]t;
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        t=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        return solve(arr,1,n-1);
        
        
    }
    static int solve(int[] arr,int i,int j){
        //base
        if(i>=j) return 0;
        if(t[i][j]!=-1) return t[i][j];
        
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i,k)+solve(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            
            if(temp<min){
                min=temp;
            }
            
        }
        return t[i][j]=min;
    }
}