class Solution {
    int[][]t;
    int findMinInsertions(String s) {
        // code here
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        t=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int lps=t[n][n];
        return n-lps;
    }
}