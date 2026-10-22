class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int res=-1;
        if(n<m*k){
            return res;
        }
        long left=Long.MAX_VALUE;
        long right=Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            left=Math.min(left, bloomDay[i]);
            right=Math.max(right, bloomDay[i]);
        }
        while(left<=right){
            long mid=left+(right-left)/2;
            if(possible(bloomDay, m, k, mid)){
                res=(int)mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return res;
    }
    public boolean possible(int[] nums, int m, int k, long mid){
        int oc=0;
        int ic=0;
        for(int i=0; i<nums.length; i++){
            if(mid>=nums[i]){
                ic++;
                if(ic==k){
                    oc++;
                    ic=0;
                }
            }else{
                ic=0;
            }
        }
        if(oc>=m){
            return true;
        }
        return false;
    }
}