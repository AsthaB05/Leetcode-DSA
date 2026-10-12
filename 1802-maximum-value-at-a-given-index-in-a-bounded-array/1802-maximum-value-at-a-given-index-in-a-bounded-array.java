class Solution {
    public int maxValue(int n, int index, int maxSum) {
        long left=1;
        long right=maxSum;
        int result=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            long lc=Math.min((long)index,mid-1);
            long lsum=formula(lc,mid)
                    +Math.max(0L, index-(mid-1));
            long rc=Math.min((long)n-index-1,mid-1);
            long rsum=formula(rc,mid)
                    +Math.max(0L, (n-index-1)-(mid-1));
            long total=lsum+rsum+mid;
            if(total<=maxSum){
                result=(int)mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
    public long formula(long lc, long i){
        return (lc*i)-(lc*(lc+1))/2;
    }                                                        
}