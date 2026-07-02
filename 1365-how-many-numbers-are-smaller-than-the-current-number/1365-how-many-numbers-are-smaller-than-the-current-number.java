class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq=new int[102];
        int[] result=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i=1; i<102; i++){
            freq[i]=freq[i]+freq[i-1];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                result[i]=0;
            }else{
                result[i]=freq[nums[i]-1];
            }
        }
        return result;
    }
}