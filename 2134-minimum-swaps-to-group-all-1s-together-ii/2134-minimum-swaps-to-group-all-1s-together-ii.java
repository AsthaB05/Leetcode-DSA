class Solution {
    public int minSwaps(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            k+=nums[i];
        }
        int start=0; 
        int end=0;
        int sum=0; 
        int max=0;
        while(end<(nums.length+k)){
            sum+=nums[end%nums.length];
            if((end-start+1)<k){
                end++;
            }else{
                max=Math.max(max,sum);
                sum-=nums[start%nums.length];
                start++;
                end++;
            }
        }
        return (k-max);
    }
}