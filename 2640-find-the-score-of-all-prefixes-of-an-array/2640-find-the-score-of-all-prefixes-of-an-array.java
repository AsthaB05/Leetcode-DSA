class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] cover=new long[nums.length];
        cover[0]=nums[0]*2;
        int max=nums[0];
        int sum=0;
        for(int i=1; i<nums.length; i++){
            max=Math.max(max, nums[i]);
            sum=max+nums[i];
            cover[i]=sum+cover[i-1];

        }
        return cover;
    }
}