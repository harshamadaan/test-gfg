class Solution {

    int search(String pat, String txt) {
        // code here
        int k=pat.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            char ch=pat.charAt(i);
            
                map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        int count=map.size();
        int i=0,j=0;
        int num=0;
        while(j<txt.length()){
            char ch=txt.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                if(count==0){
                    num++;
                    
                }
                
                char ch1=txt.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1,map.getOrDefault(ch1,0)+1);
                    if(map.get(ch1)==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
            
            
        }
        return num;
        
    }
}