class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=1;
        for(int i=0; i<nums.length; i++){
            end=Math.max(end, nums[i]);
        }
        int res=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(nums,mid)<=threshold){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public int possible(int[] nums, int mid){
        long sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=(nums[i]+mid-1)/mid;
        }
        return (int)sum;
    }
}