class Solution {
    public int largestCombination(int[] candidates) {
        int max=0;
        for(int i=0; i<24; i++){
            int count=0;
            for(int j=0; j<candidates.length; j++){
                if(((candidates[j]>>i) & 1)==1){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}