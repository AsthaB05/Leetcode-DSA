class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(Math.abs(nums[j]-nums[i])<=Math.min(nums[i],nums[j])){
                    xor=Math.max(xor,nums[i]^nums[j]);
                }
            }
        }
        return xor;
    }
}