class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start=1;
        int end=10000000;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(possible(dist, mid)<=hour){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return res;
    }
    
    public double possible(int[] dist, int mid){
        double time=0D;
        for(int i=0; i<dist.length-1; i++){
            time+=Math.ceil((double)dist[i]/mid);
        }
        time+=(double)dist[dist.length-1]/mid;
        return time;
    }
}