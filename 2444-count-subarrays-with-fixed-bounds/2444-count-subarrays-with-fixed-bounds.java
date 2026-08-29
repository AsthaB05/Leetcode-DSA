class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int mini=-1; 
        int maxi=-1;
        int out=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==minK){
                mini=i;
            }
            if(nums[i]==maxK){
                maxi=i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                out=i;
            }
            count+=Math.max(Math.min(mini,maxi)-out,0);
        }
        return count;
    }
}