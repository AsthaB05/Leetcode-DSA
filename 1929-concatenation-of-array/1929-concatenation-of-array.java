class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[2*nums.length];
        int idx=0;
        for(int i=0; i<nums.length; i++){
            res[idx]=nums[i];
            idx++;
        }
        for(int i=0; i<nums.length; i++){
            res[idx]=nums[i];
            idx++;
        }
        return res;
    }
}