class Solution {
    int[][] t;
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n=wt.length;
        t=new int[n+1] [W+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(t[i],-1);
            
        }
        return solve(wt,val,W,n);
        
    }
    public int solve(int [] wt,int[] val,int W,int n){
        if(n==0||W==0)
        return 0;
        //memorisation check
        if(t[n][W]!=-1)
        return t[n][W];
        
        if(wt[n-1]<=W){
            t[n][W]=Math.max(val[n-1]+solve(wt,val,W-wt[n-1],n-1),solve(wt,val,W,n-1));
            
        } else{
            t[n][W]=solve(wt,val,W,n-1);
        }
        return t[n][W];
    }
}
