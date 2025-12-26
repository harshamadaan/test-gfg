// User function Template for Java

class Solution {
    public int LongestRepeatingSubsequence(String s) {
        // code here
        int n=s.length();
        int [][] t=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][n];
    }
}