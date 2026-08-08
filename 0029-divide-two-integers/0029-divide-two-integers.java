class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long r=Math.abs((long)dividend);
        long s=Math.abs((long)divisor);
        long ans=0;
        while(r>=s){
            long temp=s;
            long mul=1;
            while((temp<<1)<r){
                temp=temp<<1;
                mul<<=1;
            }
            r=r-temp;
            ans=ans+mul;
        }
        if(dividend<0 && divisor>0){
            ans=-ans;
        }else if(dividend>0 && divisor<0){
            ans=-ans;
        }
        return (int)ans;
    }
}