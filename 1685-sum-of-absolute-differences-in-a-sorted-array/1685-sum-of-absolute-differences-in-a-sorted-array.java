class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        suffix[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        int[] res=new int[n];
        res[0]=suffix[1]-nums[0]*(n-1);
        res[n-1] = nums[n-1] * (n-1) - prefix[n-2];

        for(int i=1; i<n-1; i++){
            res[i]=((nums[i]*i)-prefix[i-1])+(suffix[i+1]-nums[i]*(n-i-1));
        }
        return res;
    }
}