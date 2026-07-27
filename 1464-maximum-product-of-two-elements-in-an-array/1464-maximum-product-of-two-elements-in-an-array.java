class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int second=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>largest){
                second=largest;
                largest=nums[i];
            }else if(nums[i]>second){
                second=nums[i];
            }
        }
        return (largest-1)*(second-1);
    }
}