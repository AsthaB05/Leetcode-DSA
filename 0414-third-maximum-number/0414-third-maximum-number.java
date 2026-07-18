class Solution {
    public int thirdMax(int[] nums) {
       long mx1=Long.MIN_VALUE;
       long mx2=Long.MIN_VALUE;
       long mx3=Long.MIN_VALUE;
       for(int i=0; i<nums.length; i++){
        if(nums[i]>mx3){
            if(nums[i]>mx2){
                if(nums[i]>mx1){
                    mx3=mx2;
                    mx2=mx1;
                    mx1=nums[i];
                }else if(nums[i]<mx1){
                    mx3=mx2;
                    mx2=nums[i];
                }
            }else if(nums[i]<mx2){
                mx3=nums[i];
            }
        }
       }
       if(mx3==Long.MIN_VALUE){
            return (int)mx1;
       }
       return (int)mx3;
    }
}