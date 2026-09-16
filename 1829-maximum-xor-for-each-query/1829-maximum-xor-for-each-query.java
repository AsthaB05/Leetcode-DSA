class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] res=new int[nums.length];
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        int max=((int)Math.pow(2,maximumBit))-1;
        int idx=0;
        for(int i=nums.length-1; i>=0; i--){
            res[idx]=xor^max;
            idx++;
            xor^=nums[i];
        }
        return res;
    }
}