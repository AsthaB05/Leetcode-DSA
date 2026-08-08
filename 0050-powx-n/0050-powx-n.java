class Solution {
    public double myPow(double x, int n) {
        long nn=Math.abs((long)n);
        double mul=1;
        while(nn>0){
            if(nn%2==1){
                mul=mul*x;
            }
            x=x*x;
            nn=nn/2;
        }
        if(n<0){
            mul=1/mul;
        }
        return mul;
    }
}