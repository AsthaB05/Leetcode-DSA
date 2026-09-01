class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max, nums[i]);
        }
        long res=0;
        int low=0;
        int high=0;
        int count=0;
        while(low<nums.length){
            while(count<k && high<nums.length){
                if(nums[high]==max){
                    count++;
                }
                high++;
            }
            if(count>=k){
                res+=nums.length-high+1;
            }
            if(nums[low]==max){
                count--;
            }
            
            low++;
        }
        
        return res;

    }
}