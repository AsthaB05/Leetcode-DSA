class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] count=new int[32];
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<32; j++){
                if(((nums.get(i)>>j)&1)==1){
                    count[j]++;
                }
            }
        }
        long result=0;
        int MOD = 1000000007;
        while(k>0){
            long curr=0;
            for(int j=0; j<32; j++){
                if(count[j]>0){
                    count[j]--;
                    curr=curr | (1<<j);
                }
            }
            result=(result+(curr*curr)%MOD)%MOD;
            k--;
        }
        return (int)result;
    }
}