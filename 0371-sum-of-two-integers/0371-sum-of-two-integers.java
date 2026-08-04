class Solution {
    public int getSum(int a, int b) {
        int carry=0;
        int res=0;
        for(int i=0; i<32; i++){
            int bita=(a>>i) & 1;
            int bitb=(b>>i) & 1;
            int ans=bita^bitb^carry;
            res=res | (ans<<i);
            carry=(bita & bitb) | (bita & carry) | (bitb & carry);
        }
        return res;
    }
}