class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int max=0;
        while(low<high){
            max=Math.max(max,nums[low]+nums[high]);
            low++;
            high--;
        }
        return max;
    }
}