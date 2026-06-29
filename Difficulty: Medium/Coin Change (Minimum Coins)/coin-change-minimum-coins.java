class Solution {
    int[][]t;

    public int minCoins(int coins[], int sum) {
        // code here
        int n=coins.length;
        t=new int[n+1][sum+1];
        int INF=Integer.MAX_VALUE-1;
        for(int i=0;i<=n;i++){
            t[i][0]=0;
        }
        for(int j=1;j<=sum;j++){
            t[0][j]=INF;
        }
        //init 1st row
        for(int j=1;j<=sum;j++){
            if(j%coins[0]==0){
                t[1][j]=j/coins[0];
            }else{
                t[1][j]=INF;
            }
        }
        //2nd
        for(int i=2;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1]<=j){
                    t[i][j]=Math.min(1+t[i][j-coins[i-1]],
                    t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return (t[n][sum]>=INF)? -1: t[n][sum];
        
    }
}