class Solution {
    static int[][]t;
    static int palPartition(String s) {
        // code here
        int n=s.length();
        t=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                t[i][j]=-1;
            }
        }
        return solve(s,0,n-1);
        
    }
    static boolean isPalindrome(String s,int str,int end){
        while(str<end){
            if(s.charAt(str)!=s.charAt(end)){
                
                return false;
            }
            str++;
            end--;
        }
        return true;
    }
    static int solve(String s ,int i,int j){
        if(i>=j) return 0;
        if(t[i][j]!=-1) return t[i][j];
        if(isPalindrome(s,i,j)) return t[i][j]=0;
        
        int min=Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            
            //omly cut
            if(isPalindrome(s,i,k)){
                int cuts=1+solve(s,k+1,j);
                min=Math.min(min,cuts);
            }
        }
        return t[i][j]=min;
        
    }
}