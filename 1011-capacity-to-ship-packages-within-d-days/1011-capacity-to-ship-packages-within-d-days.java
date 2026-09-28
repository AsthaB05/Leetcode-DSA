class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0; i<weights.length; i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        int capacity=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(weights, mid, days)){
                capacity=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return capacity;
    }
    public boolean isPossible(int[] nums,int mid, int days){
        int count=1;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>mid){
                count++;
                sum=nums[i];
            }
        }
        if(count<=days){
            return true;
        }
        return false;
    }
}