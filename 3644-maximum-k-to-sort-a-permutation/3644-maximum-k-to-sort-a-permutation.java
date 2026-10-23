class Solution {
    public int sortPermutation(int[] nums) {
        int res=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                res=nums[i];
                break;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                res = res & nums[i];
            }
        }
        return res;
    }
}