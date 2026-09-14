class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=1;
        int res=0;
        while(high<nums.length){
            if(nums[high]>nums[low]){
                res++;
                low++;
                
            }
            high++;
        }
        return res;
    }
}