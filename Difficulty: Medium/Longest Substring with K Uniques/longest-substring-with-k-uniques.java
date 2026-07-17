class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n=s.length();
        int i=0,j=0;
        int max=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size()>k){
                char ch1=s.charAt(i);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                   
                    
                }
                 i++;
               
                
               
                
                
                
                
            }
            if(map.size()==k){
                max=Math.max(max,j-i+1);
            }
            
             j++;
            
            
            
            
        }
        return max;
    }
}