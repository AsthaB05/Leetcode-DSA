class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int len=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }else{
                len=Math.max(len,count);
                count=0;
            }
            i++;
        }
        len=Math.max(len,count);
        return len;
    }
}