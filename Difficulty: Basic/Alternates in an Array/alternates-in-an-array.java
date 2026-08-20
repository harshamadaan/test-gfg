class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        
        // Code Here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                list.add(arr[i]);
            }
            
        }
        return list;
    }
}