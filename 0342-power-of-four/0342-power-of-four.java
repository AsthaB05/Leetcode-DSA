class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        int bits=32-Integer.numberOfLeadingZeros(n);
        if((bits%2!=0) && (n & (n-1))==0){
            return true;
        }
        return false;
    }
}