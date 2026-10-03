class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long start=1;
        long end=(long)Integer.MAX_VALUE;
        for(int i=0; i<time.length; i++){
            end=Math.min(end,time[i]);
        }
        end=(long)end*totalTrips;
        while(start<end){
            long mid=start+(end-start)/2;
            long sum=getTrip(mid,time);
            if(sum>=totalTrips){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public long getTrip(long mid, int[] time){
        long sum=0;
        for(int i=0; i<time.length; i++){
            sum+=mid/time[i];
        }
        return sum;
    }
}