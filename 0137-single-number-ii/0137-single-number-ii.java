class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0; i<32; i++){
            int sum=0;
            for(int num: nums){
                int shift=num>>i;
                int last=shift & 1;
                sum+=last;
            }
            int rem=sum%3;
            if(rem!=0){
                int one=1<<i;
                res|=one;
            }
        }
        return res;
    }
}