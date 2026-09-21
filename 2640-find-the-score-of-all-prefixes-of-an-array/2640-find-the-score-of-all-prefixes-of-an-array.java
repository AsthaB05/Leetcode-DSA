class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] cover=new long[nums.length];
        cover[0]=nums[0]*2;
        int max=nums[0];
        for(int i=1; i<nums.length; i++){
            max=Math.max(max, nums[i]);
            cover[i]=max+nums[i];
        }
        for(int i=1; i<cover.length; i++){
            cover[i]+=cover[i-1];
        }
        return cover;
    }
}