class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long left=(long)Integer.MAX_VALUE;
        long sum=0;
        for(int i=0; i<batteries.length; i++){
            left=Math.min(left,batteries[i]);
            sum+=batteries[i];
        }
        long right = sum/n;
        long result=0;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(possible(batteries, mid, n)){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return result;
    }
    public boolean possible(int[] batteries, long mid, int n){
        long target=mid*n;
        long sum=0;
        for(int i=0; i<batteries.length; i++){
            sum+=Math.min(batteries[i],mid);
            if(sum>=target){
                return true;
            }
        }
        return false;
    }
}