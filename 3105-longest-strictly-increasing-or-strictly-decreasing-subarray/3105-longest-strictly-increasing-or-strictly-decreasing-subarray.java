class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int low=0;
        int high=1;
        int res=1;
        while(high<nums.length){
            while(high<nums.length && nums[high]>(nums[high-1])){
                high++;
            }
            res=Math.max(res, high-low);
            
            high++;
            low=high-1;
        }
        low=0; 
        high=1;
        while(high<nums.length){
            while(high<nums.length && nums[high]<(nums[high-1])){
                high++;
            }
            res=Math.max(res, high-low);
            
            high++;
            low=high-1;
        }
        return res;
    }
}