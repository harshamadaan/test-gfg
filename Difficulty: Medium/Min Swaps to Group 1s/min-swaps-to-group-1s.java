class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int n=arr.length; //count 1 in array
        int ones=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ones++;
            }
        }
        //edge case
        if(ones==0){
            return -1;
        }
        if(ones==1){
            return 0;
        }
        //count 1 in ist sliding window
        int currentOnes=0;
        for(int i=0;i<ones;i++){
            if(arr[i]==1){
                currentOnes++;
            }
        }
        int maxOnes=currentOnes;
        
        //sw
        for(int i=ones;i<n;i++){
            //remove
            if(arr[i-ones]==1){
                currentOnes--;
            }
            //add e;lement
            if(arr[i]==1){
                currentOnes++;
            }
            maxOnes=Math.max(maxOnes,currentOnes);
        }
        return ones-maxOnes;
    }
}
