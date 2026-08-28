class Solution {
    public static String reverseString(String s) {
        // code here
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
        return new String(arr);
        
        
    }
}