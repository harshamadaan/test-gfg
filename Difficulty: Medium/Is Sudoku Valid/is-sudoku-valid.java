class Solution {
    public boolean isValid(int mat[][]) {
        // code here
        int N=9;
        HashSet<Integer>[] rows=new HashSet[N];
        HashSet<Integer>[] cols=new HashSet[N];
        HashSet<Integer>[] boxes=new HashSet[N];

        for(int r=0;r<N;r++){
            rows[r]=new HashSet<Integer>();
            cols[r]=new HashSet<Integer>();
            boxes[r]=new HashSet<Integer>();
        }

        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                int val=mat[r][c];

                // check if pos empty or not
                if(val==0){
                    continue;
                }
                // check row for duplicate
                if(rows[r].contains(val)){
                    return false;
                }
               rows[r].add(val);

                // check col
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                // check box
                int idx=(r/3)*3+c/3;
                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
        
    }
}