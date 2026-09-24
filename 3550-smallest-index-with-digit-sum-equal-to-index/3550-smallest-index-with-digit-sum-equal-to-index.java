class Solution {
    public int smallestIndex(int[] nums) {
        int idx=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            while(nums[i]>0){
                int ld=nums[i]%10;
                sum+=ld;
                nums[i]/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}