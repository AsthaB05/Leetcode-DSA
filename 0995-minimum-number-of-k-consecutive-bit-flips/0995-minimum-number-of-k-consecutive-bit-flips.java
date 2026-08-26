class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count=0;
        boolean[] isFliped=new boolean[nums.length];
        int pastflipcount=0;
        for(int i=0; i<nums.length; i++){
            if(i>=k && isFliped[i-k]==true){
                pastflipcount--;
            }
            if(pastflipcount%2==nums[i]){
                if(i>nums.length-k){
                    return -1;
                }
                isFliped[i]=true;
                pastflipcount++;
                count++;
            }
        }
        return count;
    }
}