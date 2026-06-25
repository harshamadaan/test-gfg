class Solution {
   static boolean[][] t;
    static boolean equalPartition(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        if(sum%2!=0) return false;
        
        // nhi to half kro or subset sum ka jsa solve kr do
        sum=sum/2;
        t=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++){
              t[i][0]=true;
        }
        for(int j=0;j<=sum;j++){
                t[0][j]=false;
                
            }
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=sum;j++){
                    if(arr[i-1]<=j){
                        t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                    }else{
                        t[i][j]= t[i-1][j];
                    }
                }
            }
               return t[n][sum];
        }
           
        
    }
