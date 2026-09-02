class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        long pro=0;
        long res=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            sum+=nums[high];
            pro=sum*(high-low+1);
            while(pro>=k && low<nums.length){
                sum-=nums[low];
                low++;
                pro=sum*(high-low+1);
            }
            res+=high-low+1;
            high++; 
        }
        return res;
    }
}