class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        }
        double max=sum/k;
        for(int i=k; i<nums.length; i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum/k);
        }
        return max;
    }
}