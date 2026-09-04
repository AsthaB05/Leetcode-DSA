class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxarr=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            maxarr[i]=max;
        }
        int[] minarr=new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=nums.length-1; i>=0; i--){
            min=Math.min(min,nums[i]);
            minarr[i]=min;
        }
        int idx=100;
        for(int i=0; i<maxarr.length; i++){
            if((maxarr[i]-minarr[i])<=k){
                idx=Math.min(idx,i);
            }
        }
        if(idx==100){
            return -1;
        }
        return idx;
    }
}