class Solution {

    public String encode(String arr[]) {
        // write your logic to encode the strings
        StringBuilder sb =new StringBuilder();
        for(String str:arr){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
        
    }

    public ArrayList<String> decode(String s) {
        // write your logic to decode the string
        ArrayList<String> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
             int sepIdx=s.indexOf("#",i);
        int len=Integer.parseInt(s.substring(i,sepIdx));
        i=sepIdx+1;
        String decodedString=s.substring(i,i+len);
        ans.add(decodedString);
        i=i+len;
            
        }
        return ans;
       
    }
}