class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n=s.length();
        int i=0,j=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==j-i+1){
                max=Math.max(max,j-i+1);
                j++;
            }else if(map.size()<j-i+1){
                while(map.size()<j-i+1){
                    char ch1=s.charAt(i);
                    map.put(ch1,map.get(ch1)-1);
                    if(map.get(ch1)==0){
                        map.remove(ch1);
                    }
                    i++;
                }
                j++;
                
            }
            
        }
        return max;
        
    }
}