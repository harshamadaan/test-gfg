class Solution {
    int[][]t;
    public int knapSack(int val[], int wt[], int capacity) {
        // code here
        t=new int[wt.length+1][capacity+1];
        for(int i=0 ;i<=wt.length;i++){
            t[i][0]=0;
        }
        for(int j=1;j<=capacity;j++){
            t[0][j]=0;
        }
        for(int i=1;i<=wt.length;i++){
            for(int j=0;j<=capacity;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1]+t[i][j-wt[i-1]] ,
                    t[i-1][j]);
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[wt.length][capacity];
        
    }
}