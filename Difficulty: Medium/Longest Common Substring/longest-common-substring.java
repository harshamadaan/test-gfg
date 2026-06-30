class Solution {
    int[][]t;
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m=s1.length();
        int n=s2.length();
        t=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            t[i][0]=0;
            for(int j=0;j<=n;j++){
                t[0][j]=0;
            }
        }
        int maxLen=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    maxLen=Math.max(maxLen,t[i][j]);
                }else{
                    t[i][j]=0;
                }
            }
        }
        return maxLen;
        
    }
}