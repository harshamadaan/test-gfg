class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(map.get(arr[i])>n/2){
                    return arr[i];
                }
            }
            return -1;
        
    }
}