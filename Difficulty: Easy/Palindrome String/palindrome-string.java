class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}