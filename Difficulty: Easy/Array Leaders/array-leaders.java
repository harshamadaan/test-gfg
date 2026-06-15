class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> leaders=new  ArrayList<>();
        int maxEle=arr[n-1];
         leaders.add(maxEle);
        
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxEle){
                maxEle=arr[i];
                leaders.add(arr[i]);
            }
            
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
