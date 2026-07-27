class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[nums.length-1]){
                int temp=nums[i];
                nums[i]=nums[nums.length-1];
                nums[nums.length-1]=temp;
            }
        }
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]>nums[nums.length-2]){
                int temp=nums[i];
                nums[i]=nums[nums.length-2];
                nums[nums.length-2]=temp;
            }
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}