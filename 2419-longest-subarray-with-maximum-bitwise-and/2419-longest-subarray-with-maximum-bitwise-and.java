class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
        }
        int len=0;
        int curr=0;
        int count=0;
        while(curr<nums.length){
            if(nums[curr]==max){
                count++;
            }else{
                len=Math.max(count,len);
                count=0;
            }
            curr++;
            len=Math.max(count,len);
        }
        return len;
    }
}