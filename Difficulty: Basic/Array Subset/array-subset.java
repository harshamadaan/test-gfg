
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int x:a){
           map.put(x,map.getOrDefault(x,0)+1);
       }
       //check ele for b
       for(int x:b){
           if(!map.containsKey(x) || map.get(x)==0){
               return false;
           }
           
           map.put(x,map.get(x)-1);
       }
       return true;
        
    }
}
