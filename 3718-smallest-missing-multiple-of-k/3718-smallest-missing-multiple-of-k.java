class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] freq=new boolean[102];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]=true;
        }
        for(int i=1; i<freq.length; i++){
            if(!freq[i]){
                if(i%k==0){
                    return i;
                }
            }
        }
        for(int i=100; i>=1; i--){
            if(freq[i]){
                if(i%k==0){
                    return i+k;
                }
            }
        }
        return -1;
    }
}