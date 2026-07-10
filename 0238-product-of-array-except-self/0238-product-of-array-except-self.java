class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix=new int[nums.length];
        int[] sufix=new int[nums.length];

        prefix[0]=1;
        for(int i=1; i<nums.length; i++){
            prefix[i]=nums[i-1]*prefix[i-1];           
        }

        sufix[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            sufix[i]=nums[i+1]*sufix[i+1];
        }

        int[] res=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i]=prefix[i]*sufix[i];
        }

        return res;
    }
}