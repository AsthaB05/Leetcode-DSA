class Solution {
    public long minCost(int[] nums, int[] cost) {
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            start=Math.min(start,nums[i]);
            end=Math.max(end,nums[i]);
        }
        long result=Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            long costmid=findCost(mid ,nums ,cost);
            long costmid1=findCost(mid+1, nums, cost);
            result=Math.min(costmid, costmid1);
            if(costmid<costmid1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        if(result==Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
    public long findCost(int x, int[]nums, int[]cost){
        long cos=0;
        for(int i=0; i<nums.length; i++){
            cos+=(long)Math.abs(x-nums[i])*cost[i];
        }
        return cos;
    }
}