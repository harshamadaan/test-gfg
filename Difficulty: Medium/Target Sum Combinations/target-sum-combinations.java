class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
        int n=arr.length;
                ArrayList<ArrayList<Integer>> res=new ArrayList<>();
                ArrayList<Integer> comb=new ArrayList<>();
                backtrack(target,res,comb,0,arr);
                return res;

            }
            private void backtrack(int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer>comb,int start,int[] arr){
                int n=arr.length;
                if(target==0){
                    res.add(new ArrayList<>(comb));

                }else if(target <0){
                    return;
                }

                for(int i=start;i<n;i++){
                    comb.add(arr[i]);
                    backtrack(target-arr[i],res,comb,i,arr);
                    comb.remove(comb.size()-1);
                }
    }
}