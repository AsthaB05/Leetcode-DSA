class Solution {
    public int longestNiceSubarray(int[] nums) {
        int[] set=new int[30];
        int len=1;
        int low=0;
        int high=0;
        int mask=0;
        while(high<nums.length){
            while((mask & nums[high])!=0){
                mask^=nums[low];
                low++;
            }
            len=Math.max(len,high-low+1);
            mask|=nums[high];
            high++;
        }
        return len;
    }
}