class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid+1]){
                if((end-mid)%2==0){
                    end=mid;
                }else {
                    start=mid+1;
                }
            }else if(nums[mid]==nums[mid+1]){
                if((end-mid)%2==0){
                    start=mid+2;
                }else{
                    end=mid-1;
                }
            }
        }
        return nums[end];
    }
}