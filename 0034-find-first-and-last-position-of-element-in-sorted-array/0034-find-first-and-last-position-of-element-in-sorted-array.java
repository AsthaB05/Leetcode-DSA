class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos=new int[2];
        int start=0;
        int end=nums.length-1;
        int left=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                left=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        int right=-1;
        start=0;
        end=nums.length-1;
        while(left!=-1 && start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                right=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        pos[0]=left;
        pos[1]=right;
        return pos;
    }
}