class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long res=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            int start=findStart(i, nums, lower, upper);
            int end=findEnd(i, nums, lower, upper);
            if(start!=-1 && end!=-1 && start<=end){
                res+=end-start+1;
            }
            
        }
        return res;
    }
    public int findStart(int i, int[] nums, int lower, int upper){
        int start=i+1;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((nums[i]+nums[mid])>=lower){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public int findEnd(int i, int[] nums, int lower, int upper){
        int start=i+1;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((nums[i]+nums[mid])<=upper){
                result=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
}