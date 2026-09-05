class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffix=new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            min=Math.min(min,nums[i]);
            suffix[i]=min;           
        }
        int max=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            if((max-suffix[i])<=k){
                return i;
            }
        }
        return -1;
    }
}