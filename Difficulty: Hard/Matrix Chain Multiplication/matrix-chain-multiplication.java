class Solution {
    static int [][] t=new int[1001][1001];
    static int matrixMultiplication(int arr[]) {
        // code here
        int N=arr.length;
        for(int i=0;i<1001;i++){
            for(int j=0;j<1001;j++){
                t[i][j]=-1;
            }
        }
        return solve(arr,1,N-1);
        
    }
    static int solve(int[]arr,int i,int j){
        //base case
        if(i>=j) return 0;
        if(t[i][j]!=-1) return t[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min=Math.min(min , temp);
        }
        return t[i][j]=min;
        
    }
}