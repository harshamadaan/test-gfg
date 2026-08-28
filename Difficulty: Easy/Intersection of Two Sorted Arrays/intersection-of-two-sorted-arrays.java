class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        
         while(i<n && j<m){
             if(a[i]==b[j]){
                 if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i]){
                     ans.add(a[i]);
                 }
                 i++;
             j++;
                 
             } else if(a[i]<b[j]){
                 i++;
             }else{
                 j++;
             }
             
         }
         return ans;
    }
}