class Solution {
    public int minimizeArrayValue(int[] nums) {
        int start=1;
        int end=0;
        for(int i=0; i<nums.length; i++){
            end=Math.max(end,nums[i]);
        }
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(nums, mid)){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public boolean isValid(int[] nums, int mid){
        long[] arr = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>mid){
                return false;
            }
            long buffer=mid-arr[i];
            arr[i+1]=arr[i+1]-buffer;
        }
        return (arr[arr.length-1]<=mid);
    }
}