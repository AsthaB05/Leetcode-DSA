class Solution {
    public int longestSubarray(int[] nums) {
        int flip=0;
        int len=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            if(nums[high]==0){
                flip++;
            }
            while(flip>1){
                if(nums[low]==0){
                    flip--;
                }
                low++;
            }
            high++;
            len=Math.max(len,(high-low-1));
        }
        return len;
    }
}