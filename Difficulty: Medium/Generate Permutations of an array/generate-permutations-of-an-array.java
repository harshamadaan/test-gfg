class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        int n=arr.length;
                ArrayList<ArrayList<Integer>> res= new ArrayList<>();
                boolean[] used=new boolean[n];
                backtrack(res,new ArrayList<>(),arr,used);
                return res;

            }

            private static void backtrack(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> curr,int[]arr,boolean[] used){
                //bc
                int n=arr.length;
                if(curr.size()==n){
                    res.add(new ArrayList<>(curr));
                    return;
                }

                // nhi to 
                for(int i=0;i<n;i++){
                    if(!used[i]){
                        curr.add(arr[i]);
                        used[i]=true;

                        backtrack(res,curr,arr,used);
                        used[i]=false;
                        curr.remove(curr.size()-1);
                    }
                }
    }
};