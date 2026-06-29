class Solution {
    int[][] t;
    public int count(int coins[], int sum) {
        // code here.
        int n=coins.length;
        t=new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            t[i][0]=1;
        }
        for(int j=1;j<=sum;j++){
            t[0][j]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(coins[i-1]<=j){
                    t[i][j]=t[i][j-coins[i-1]]+t[i-1][j];
                }else{
                    t[i][j]=+t[i-1][j];
                }
            }
        }
        return t[n][sum];
        
    }
}