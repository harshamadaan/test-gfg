class Solution {
    public static boolean checkPangram(String s) {
        // code here
        Set<Character> ans=new HashSet<>();
        for(int i='a';i<='z';i++){
            ans.add((char) i);
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            
            char ch=Character.toLowerCase(s.charAt(i));
            ans.remove(ch);
            if(ans.isEmpty()){
                return true;
            }
            
        }
        return false;
    }
}