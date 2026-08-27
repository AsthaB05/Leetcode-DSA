class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int len=0;
        int zcount=0;
        while(right<nums.length){
            if(nums[right]==0){
                zcount++; 
            }
            if(zcount>k){
                while(zcount>k){
                    if(nums[left]==0){
                        zcount--;
                    }
                    left++;
                }
            }
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}