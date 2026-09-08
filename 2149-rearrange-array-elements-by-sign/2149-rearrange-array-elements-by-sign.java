class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int idx=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                res[idx]=nums[i];
                idx+=2;
            }
        }
        idx=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                res[idx]=nums[i];
                idx+=2;
            }
        }
        return res;
    }
}