class Solution {
    public int countKDifference(int[] nums, int k) {
        int pair=0;
        int[] freq=new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i=0; i<=100; i++){
            if((i+k)<=100){
                pair+=freq[i]*freq[i+k];
            }
        }
        return pair;
    }
}