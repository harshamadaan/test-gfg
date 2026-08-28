class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        int n=s.length();
        String[] words=s.trim().split("\\s+");
        StringBuilder ans=new StringBuilder();
        ans.append(words[0]);
        
        for(int i=1;i<words.length;i++){
            ans.append(Character.toUpperCase(words[i].charAt(0)));
            
            ans.append(words[i].substring(1));
        }
        return ans.toString();
        
    }
}