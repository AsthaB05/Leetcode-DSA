class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int left=0; 
        int right=0;
        int sum=0;
        while(right<nums.length){
            sum=sum+nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;

            }
            right++;
            
        }
        if(min!=Integer.MAX_VALUE){
            return min;
        }else{
            return 0;
        }
    }
}