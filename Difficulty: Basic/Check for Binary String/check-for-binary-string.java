class Solution {
    public boolean isBinary(String s) {
        // code here
        int n=s.length();
       char[] arr=s.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]!='0' && arr[i]!='1'){
                return false;
            }
        }
        return true;
    }
}