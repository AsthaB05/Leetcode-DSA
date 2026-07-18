class Solution {
    public int findGCD(int[] nums) {
        int min=1000;
        int max=1;
        for(int i=0; i<nums.length; i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        while(min!=0){
            int rem=max%min;
            max=min;
            min=rem;
        }
        return max;
    }
}