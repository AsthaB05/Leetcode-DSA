class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int write=2;
        for(int read=2; read<nums.length; read++){
            if(nums[write-2]!=nums[read]){
                nums[write]=nums[read];
                write++;
            }
        }
        return write;
    }
}