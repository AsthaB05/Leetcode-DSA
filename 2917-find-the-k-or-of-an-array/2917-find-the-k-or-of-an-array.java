class Solution {
    public int findKOr(int[] nums, int k) {
        int res=0;
        for(int i=0; i<32; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(((nums[j]>>i) & 1)==1){
                    count++;
                }
            }
            if(count>=k){
                res=(1<<i) | res;
            }
        }
        return res;
    }
}