class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];
        int n=nums.length;
        for(int i=0; i<nums.length-k+1; i++){
            int max=nums[i];
            for(int j=i+1; j<i+k; j++){
                if(nums[j]-nums[j-1]==1){
                    max=Math.max(max,nums[j]);
                }else{
                    max=-1;
                    break;
                }
            }
            res[i]=max;
        }
        return res;
    }
}