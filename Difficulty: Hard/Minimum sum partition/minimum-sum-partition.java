class Solution {
    boolean[][] t;
    public int minDifference(int arr[]) {
        // code here
        int n=arr.length;
        int range=0;
        for(int x:arr){
            range+=x;
        }
        t=new boolean[n+1][range+1];
        for(int i=0;i<=n;i++){
            t[i][0]=true;
        }
        for(int j=1;j<=range;j++){
            t[0][j]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=range;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int s1=0;s1<=range/2;s1++){
            if(t[n][s1]){
                min=Math.min(min,range-2*s1);
            }
        }
        return min;
        
    }
}
