class Solution {
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
                Arrays.sort(arr);

                backtrack(target,res,new ArrayList<>(),0,arr);
                return res;


            }

            public void backtrack(int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> curr,int start,int[] arr){
                if(target==0){
                   res.add(new ArrayList<>(curr));
                   return;
                }

                for(int i=start;i<arr.length;i++){
                    // skip dup
                    if(i> start && arr[i]==arr[i-1]){
                        continue;
                    }
                    // early termination
                    if(target < 0){
                        return;
                    }
                    curr.add(arr[i]);
                    backtrack(target-arr[i],res,curr,i+1,arr);
                    curr.remove(curr.size()-1);
                }
            }
    
}