

class Solution {
    // Function to find the largest number after k swaps.
    String max;
    public String findMaximumNum(String s, int k) {
        // code here.
        max=s;
        solve(s.toCharArray(),k,0);
        return max;
    }
    private void solve(char[] s,int k,int start){
        int n=s.length;
        if(k==0 || start==n)
        return;
        
        char maxChar=s[start];
        //find max from start to end
        for(int i=start+1;i<n;i++){
            if(s[i] > maxChar){
                maxChar=s[i];
            }
        }
        if(maxChar!=s[start]) k--; // if swap reduce k
        for(int i=start; i<n; i++){
            if(s[i]==maxChar){
                swap(s,start,i);
                String curr=new String(s);
                if(curr.compareTo(max)>0){//check lexographyical order 
                max=curr;
                    
                }
                solve(s,k,start + 1);
                swap(s,start,i);
            }
        }
    }
    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}