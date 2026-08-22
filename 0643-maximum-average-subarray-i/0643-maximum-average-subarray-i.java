class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        double sum=0;
        while(end<nums.length){
            sum+=nums[end];
            if((end-start+1)<k){
                end++;
            }else{
                max=Math.max(max, sum/k);
                sum-=nums[start];
                start++;
                end++;
            }
        }
        return max;
    }
}